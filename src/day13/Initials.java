package day13;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first name");
        String first=scan.next().substring(0,1).toUpperCase();


        System.out.println("Enter your last name");
        String last=scan.next().substring(0,1).toUpperCase();

        System.out.println("Initials: "+first+"."+last+".");
scan.close();


    }
}
