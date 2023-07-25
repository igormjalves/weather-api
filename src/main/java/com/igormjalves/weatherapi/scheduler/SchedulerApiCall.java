package com.igormjalves.weatherapi.scheduler;

import com.igormjalves.weatherapi.dto.WeatherDataDTO;
import com.igormjalves.weatherapi.dto.mapper.WeatherDataMapper;
import com.igormjalves.weatherapi.repository.WeatherDataRepository;
import com.igormjalves.weatherapi.service.WeatherApiService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@EnableScheduling
@Component
public class SchedulerApiCall {

    private final WeatherApiService weatherApiService;
    private final WeatherDataRepository weatherDataRepository;
    private final WeatherDataMapper weatherDataMapper;
    private final long scheduledInterval = 600000L;

    public SchedulerApiCall(WeatherApiService weatherApiService, WeatherDataRepository weatherDataRepository, WeatherDataMapper weatherDataMapper) {
        this.weatherApiService = weatherApiService;
        this.weatherDataRepository = weatherDataRepository;
        this.weatherDataMapper = weatherDataMapper;
    }

    @Scheduled(fixedRate = scheduledInterval)
    public void makeAPICallAndSaveToDataBase(){
        WeatherDataDTO weatherDataDTO = weatherApiService.getWeatherDataFromOpenAPI();
        if(weatherDataDTO != null) {
            weatherDataRepository.save(weatherDataMapper.toEntity(weatherDataDTO));
            System.out.println("Weather data saved at:" + LocalDateTime.now());
        } else {
            System.out.println("Failed to fetch data.");
        }
    }
}
