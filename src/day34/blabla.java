package day34;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class blabla {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-YYYY");
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.format(df));


        String result = LocalDate.of(2022, 01, 01).format(DateTimeFormatter.ofPattern("EEEE"));

        System.out.println(result);
    }
}
