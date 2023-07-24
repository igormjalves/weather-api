package com.igormjalves.weatherapi.repository;

import com.igormjalves.weatherapi.model.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {

    @Query("SELECT wd FROM WeatherData wd WHERE wd.dateTime BETWEEN :startDate AND :endDate")
    List<WeatherData> findByDateTimeBetween(LocalDateTime startDate, LocalDateTime endDate);
}
