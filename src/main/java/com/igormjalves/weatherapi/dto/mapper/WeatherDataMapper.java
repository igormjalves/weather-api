package com.igormjalves.weatherapi.dto.mapper;

import com.igormjalves.weatherapi.dto.WeatherDataDTO;
import com.igormjalves.weatherapi.model.WeatherData;
import com.igormjalves.weatherapi.util.DateTimeUtil;
import org.springframework.stereotype.Component;

@Component
public class WeatherDataMapper {
    public WeatherDataDTO toDTO(WeatherData weatherData) {
        if(weatherData == null) {
            return null;
        }
        return new WeatherDataDTO(
                weatherData.getId(),
                weatherData.getWeatherStatus(),
                weatherData.getDescription(),
                weatherData.getDateTime(),
                weatherData.getTemp(),
                weatherData.getFeelsLike(),
                weatherData.getTempMin(),
                weatherData.getTempMax(),
                weatherData.getHumidity(),
                weatherData.getSunrise(),
                weatherData.getSunset(),
                weatherData.getCity(),
                weatherData.getCountry()
        );
    }

    public WeatherData toEntity(WeatherDataDTO weatherDataDTO) {
        if(weatherDataDTO == null) {
            return null;
        }
        return new WeatherData(
                weatherDataDTO.getId(),
                weatherDataDTO.getWeatherStatus(),
                weatherDataDTO.getDescription(),
                weatherDataDTO.getDateTime(),
                weatherDataDTO.getTemp(),
                weatherDataDTO.getFeelsLike(),
                weatherDataDTO.getTempMin(),
                weatherDataDTO.getTempMax(),
                weatherDataDTO.getHumidity(),
                weatherDataDTO.getSunrise(),
                weatherDataDTO.getSunset(),
                weatherDataDTO.getCity(),
                weatherDataDTO.getCountry()
        );
    }
}
