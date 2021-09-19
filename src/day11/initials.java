package day11;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine();

        String firstName=fullName.substring(0, fullName.indexOf(" ")).toUpperCase();
        String lastName=fullName.substring(fullName.indexOf(" ")+1).toUpperCase();

        String initial=firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();
        System.out.println("initial = " + initial);
        scan.close();

    }
}
