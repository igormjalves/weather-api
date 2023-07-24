package com.igormjalves.weatherapi.service;

import com.igormjalves.weatherapi.dto.WeatherDataDTO;
import com.igormjalves.weatherapi.dto.mapper.WeatherDataMapper;
import com.igormjalves.weatherapi.repository.WeatherDataRepository;
import com.igormjalves.weatherapi.util.DateTimeUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherDataService {

    private final WeatherDataRepository weatherDataRepository;
    private final WeatherDataMapper weatherDataMapper;

    public WeatherDataService(WeatherDataRepository weatherDataRepository, WeatherDataMapper weatherDataMapper) {
        this.weatherDataRepository = weatherDataRepository;
        this.weatherDataMapper = weatherDataMapper;
    }

    public List<WeatherDataDTO> list() {
        return weatherDataRepository.findAll()
                .stream()
                .map(weatherDataMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<WeatherDataDTO> findWeatherDataWithinDateInterval(String startDateTime, String endDateTime) {

        LocalDateTime formattedStartDateTime = DateTimeUtil.parseDateTime(startDateTime);
        LocalDateTime formattedEndDateTime = DateTimeUtil.parseDateTime(endDateTime);

        return weatherDataRepository.findByDateTimeBetween(formattedStartDateTime, formattedEndDateTime)
                .stream()
                .map(weatherDataMapper::toDTO)
                .collect(Collectors.toList());
    }

}
