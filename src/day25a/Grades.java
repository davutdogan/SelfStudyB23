package day25a;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String first = scan.next();

        System.out.println("Enter last name");
        String last=scan.next();

        String name=first.toUpperCase().substring(0,1)+first.toLowerCase().substring(1);
        String lName=last.toUpperCase().substring(0,1)+last.toLowerCase().substring(1);
        System.out.println(name+" "+lName);
    }
}
