package day34;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 1, 1);
        LocalTime time = LocalTime.of(17, 45);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
    }
}
