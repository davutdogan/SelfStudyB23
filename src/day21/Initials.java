package day21;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();


        //String initials = "Initials:" + firstName.substring(0, 1).toUpperCase() +
        //      "." + lastName.substring(0, 1).toUpperCase() + ".";
        //System.out.println(initials);
        String initials=firstName.charAt(0)+"."+lastName.charAt(0)+".";
        initials=initials.toUpperCase();
        System.out.println(initials);
    }
}
