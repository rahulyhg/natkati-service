package com.smart.droid.natkati.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TypeUtil {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

    public static LocalDate toISOLocalDate(String queryDate) {
        return LocalDate.parse(queryDate);
    }

}
