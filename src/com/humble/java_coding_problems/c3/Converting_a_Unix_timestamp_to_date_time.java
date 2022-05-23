package com.humble.java_coding_problems.c3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Converting_a_Unix_timestamp_to_date_time {

    private static final long unixTimeStamp = 1573768800;

    private static void unixConverter(long unixTimeStamp){

        Date date = new Date(unixTimeStamp * 1000L);

        Date date1 = new Date(TimeUnit.MILLISECONDS.convert(unixTimeStamp, TimeUnit.MILLISECONDS));

        Instant instant = Instant.ofEpochSecond(unixTimeStamp);
        Date dateInstant = Date.from(instant);


        // 2019-11-15T06:00
        LocalDateTime date3 = LocalDateTime
                .ofInstant(instant, ZoneId.of("Australia/Perth"));

        // 2019-Nov-15 00:00:00 +0200 Europe/Bucharest
        ZonedDateTime date4 = ZonedDateTime
                .ofInstant(instant, ZoneId.of("Europe/Bucharest"));


        System.out.println(date);

        System.out.println(date1);

        System.out.println(instant);

        System.out.println(dateInstant);

        System.out.println(date3);

        System.out.println(date4);
    }

    public static void main(String[] args) {
        unixConverter(unixTimeStamp);
    }

}
