package com.igormjalves.weatherapi.service;

import com.igormjalves.weatherapi.dto.WeatherDataDTO;
import com.igormjalves.weatherapi.model.WeatherApiResponse;
import com.igormjalves.weatherapi.util.DateTimeUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {

    @Value("${openweather.api.key}")
    private String apiKey;

    public WeatherDataDTO getWeatherDataFromOpenAPI() {
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?lat=-9.54335205&lon=-35.707791630357235&units=metric&lang=pt_br&appid={apiKey}";
        String url = apiUrl.replace("{apiKey}", apiKey);
        RestTemplate restTemplate = new RestTemplate();
        WeatherApiResponse result = restTemplate.getForObject(url, WeatherApiResponse.class);

        if(result != null) {

            WeatherDataDTO weatherDataDTO = new WeatherDataDTO();
            weatherDataDTO.setWeatherStatus(result.getWeather().get(0).getMain());
            weatherDataDTO.setDescription(result.getWeather().get(0).getDescription());
            weatherDataDTO.setTemp(result.getMain().getTemp());
            weatherDataDTO.setFeelsLike(result.getMain().getFeels_like());
            weatherDataDTO.setTempMin(result.getMain().getTemp_min());
            weatherDataDTO.setTempMax(result.getMain().getTemp_max());
            weatherDataDTO.setHumidity(result.getMain().getHumidity());
            weatherDataDTO.setSunset(DateTimeUtil.parseTimetoString(result.getSys().getSunset()+result.getTimezone()));
            weatherDataDTO.setSunrise(DateTimeUtil.parseTimetoString(result.getSys().getSunrise()+result.getTimezone()));
            weatherDataDTO.setCountry(result.getSys().getCountry());
            weatherDataDTO.setCity(result.getName());
            weatherDataDTO.setDateTime(DateTimeUtil.parseDateTime(result.getDt()+result.getTimezone()));

            return weatherDataDTO;
        }

        return null;
    }

}
