package day6;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName=scan.next();
        char firstNameindex=firstName.charAt(0);

        System.out.println("Enter your last name:");
        String lastName=scan.next();
        char lastNameIndex=lastName.charAt(0);

        System.out.println("Initials: "+firstNameindex+"."+lastNameIndex+".");

    }
}
