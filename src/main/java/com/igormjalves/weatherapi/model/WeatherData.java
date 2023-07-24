package com.igormjalves.weatherapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "weather")
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weather_generator")
    @SequenceGenerator(name = "weather_generator", sequenceName = "weather_seq", allocationSize = 1)
    private Long id;

    @Column(name = "weather_status", length = 100, nullable = false)
    private String weatherStatus;

    @Column(length = 100, nullable = false)
    private String description;

    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;

    @Column(nullable = false)
    private float temp;

    @Column(name = "feels_like", nullable = false)
    private float feelsLike;

    @Column(name = "temp_min", nullable = false)
    private float tempMin;

    @Column(name = "temp_max", nullable = false)
    private float tempMax;

    @Column(nullable = false)
    private int humidity;

    @Column(nullable = false)
    private String sunrise;

    @Column(nullable = false)
    private String sunset;

    @Column(length = 100, nullable = false)
    private String city;

    @Column(length = 100, nullable = false)
    private String country;
}
