package com.humble.java_coding_problems.c3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculatingAge {

    private static long years(){

        LocalDate startLocalDate = LocalDate.of(1999, 03, 17);
        LocalDate endLocalDate = LocalDate.now();

        long years = ChronoUnit.YEARS.between(startLocalDate, endLocalDate);

        return years;
    }

    private static int yearsMonthsAndDays(){

        LocalDate startLocalDate = LocalDate.of(1999, 03, 17);
        LocalDate endLocalDate = LocalDate.now();

        Period periodBetween = Period.between(startLocalDate, endLocalDate);


        System.out.println(periodBetween.getYears() + "years");
        System.out.println(periodBetween.getMonths() + "months");
        System.out.println(periodBetween.getDays() + "days");

        return 0;

    }

    public static void main(String[] args) {

        System.out.println(years());

        System.out.println(yearsMonthsAndDays());

    }


}
