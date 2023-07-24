package com.igormjalves.weatherapi.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDataDTO {

    private Long id;

    private String weatherStatus;

    private String description;

    private LocalDateTime dateTime;

    private float temp;

    private float feelsLike;

    private float tempMin;

    private float tempMax;

    private int humidity;

    private String sunrise;

    private String sunset;

    private String city;

    private String country;
}
