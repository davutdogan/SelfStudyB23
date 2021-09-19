package day7;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your first name");
        String name=scan.next();

        System.out.println("Enter your last name");
        String lastName=scan.next();

        char initialName=name.charAt(0);
        char initialLastname=lastName.charAt(0);
        System.out.println("initials = " + initialName+"."+initialLastname+".");;
    }
}
