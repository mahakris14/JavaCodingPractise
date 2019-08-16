package com.sample;

import java.time.*;

public class DateEx1 {

    public static void main(String [] args){

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getHour());

        LocalDate independenceDay = LocalDate.of(1947, Month.AUGUST,15);
        System.out.println(independenceDay);

        LocalTime timeOfIndependence = LocalTime.of(12,00,00);
        System.out.println(timeOfIndependence);


        Instant i1 = Instant.now();
        int count = 0;
        for(int i = 0 ;i<1000; i++){
            count++;
        }

        Instant i2 = Instant.now();
        System.out.println(Duration.between(i1,i2).toMillis());

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2019,8,25);
        checkBeforeDate(d1, d2);
        checkAfterDate(d1, d2);


    }

    private static void checkAfterDate(LocalDate d1, LocalDate d2) {

        System.out.println(d1.isAfter(d2));
    }

    private static void checkBeforeDate(LocalDate d1, LocalDate d2) {
        System.out.println(d1.isBefore(d2));
    }
}
