package com.igormjalves.weatherapi.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    private static final String DATE_TIME_PATTERN = "dd/MM/yyyy HH:mm:ss";
    private static final String TIME_PATTERN = "HH:mm:ss";

    public static LocalDateTime parseDateTime(String dateTimeStr) {
        return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern(DATE_TIME_PATTERN));
    }

    public static LocalDateTime parseDateTime(long dateTimeUnix) {
        return Instant
                .ofEpochSecond(dateTimeUnix)
                .atZone(ZoneOffset.UTC)
                .toLocalDateTime();
    }

    public static String parseTime(long dateTimeUnix) {
        return Instant
                .ofEpochSecond(dateTimeUnix)
                .atZone(ZoneOffset.UTC)
                .toLocalDateTime()
                .format(DateTimeFormatter.ofPattern(TIME_PATTERN));
    }
}
