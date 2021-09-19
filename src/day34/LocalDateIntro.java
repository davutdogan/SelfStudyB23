package day34;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
       LocalDate eid= LocalDate.of(2021,8,15);
        System.out.println(eid);

        LocalDate today=LocalDate.now();
        System.out.println(today);

        System.out.println("===================");

        String[]names={"Demet","Zelis","Erkan"};
        LocalDate[]DoB={LocalDate.of(1990,5,25),
        LocalDate.of(1990,2,13),
        LocalDate.of(1985,9,1)};

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]+"'s birthday is:"+DoB[i]);
        }

        System.out.println("==================");
        LocalDate todaycurrent=LocalDate.now();
        LocalDate testDay=todaycurrent.plusDays(14);
        System.out.println(todaycurrent);
        System.out.println(testDay);

    }
}
