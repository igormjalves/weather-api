package com.igormjalves.weatherapi.controller;

import com.igormjalves.weatherapi.dto.WeatherDataDTO;
import com.igormjalves.weatherapi.service.WeatherDataService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/weatherdata")
public class WeatherDataController {
    private final WeatherDataService weatherDataService;


    public WeatherDataController(WeatherDataService weatherDataService) {
        this.weatherDataService = weatherDataService;
    }

    @GetMapping
    public ResponseEntity<List<WeatherDataDTO>> getAllWeatherData() {
        return ResponseEntity.status(HttpStatus.OK).body(weatherDataService.list());
    }

    @GetMapping("/interval")
    public List<WeatherDataDTO> getWeatherDataWithinDateInterval(@RequestParam String startDateTime, @RequestParam String endDateTime) {
        return weatherDataService.findWeatherDataWithinDateInterval(startDateTime, endDateTime);
    }
}
