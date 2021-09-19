package day34;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter DF=DateTimeFormatter.ofPattern("MMM/dd/YYYY");
        System.out.println(today.format(DF));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        LocalDateTime a=LocalDateTime.now();
        System.out.println(a);

        LocalDate today2=LocalDate.now();
        System.out.println(today2);
    }
}
