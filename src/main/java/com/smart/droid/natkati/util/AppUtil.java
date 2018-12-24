package com.smart.droid.natkati.util;

import java.time.LocalDate;

public class AppUtil {

    public static LocalDate madhamStartDate(Integer year, Integer month) {
        return LocalDate.of(year, month, 1);
    }

    public static LocalDate madhamEndDate(Integer year, Integer month) {
        LocalDate startDate = LocalDate.of(year, month, 1);
        return startDate.withDayOfMonth(startDate.getMonth().length(startDate.isLeapYear()));
    }


}
