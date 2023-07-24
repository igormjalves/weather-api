package com.igormjalves.weatherapi.model;

import lombok.Data;

import java.util.List;

@Data
public class WeatherApiResponse {

    private List<MainWeatherInfo> weather;
    private WeatherDetails main;
    private WeatherExtraInfo sys;
    private long dt;
    private int timezone;
    private String name;
}
