package org.example.java.time.tasks;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class howToGetTime {
    @Test
    void howToGetTime1() {
        //new LocalDateTime.now();

        LocalDateTime.now();
        LocalDate.now();

    }

    @Test
    void whatResult() {

        LocalDateTime time = LocalDateTime.of(2017, Month.AUGUST, 8, 15,38);
        String dateTime = time.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        );
        System.out.println("dateTime = " + dateTime);

    }

    @Test
    void whatResult_2() {

        LocalDate time1 = LocalDate.of(2017, Month.NOVEMBER, 8);

        time1.plusYears(2).plusMonths(4).plusDays(4);   //result ignored because class immutable

        System.out.println("time1 = " + time1);

    }

    @Test
    void whatResult_3() {

        LocalDate time1 = LocalDate.of(2017, Month.NOVEMBER, 8);

        //time1 = time1.plus(48, ChronoUnit.HOURS);   //Runtime Error тому що працює лише з днями місяцями

        System.out.println("time1 = " + time1);

    }
}
