package com.igormjalves.weatherapi.model;

import lombok.Data;

@Data
public class WeatherExtraInfo {
    private String country;
    private long sunrise;
    private long sunset;
}
