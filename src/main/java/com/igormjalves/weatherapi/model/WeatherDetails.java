package com.igormjalves.weatherapi.model;

import lombok.Data;

@Data
public class WeatherDetails {

    private float temp;
    private float feels_like;
    private float temp_min;
    private float temp_max;
    private int humidity;
}
