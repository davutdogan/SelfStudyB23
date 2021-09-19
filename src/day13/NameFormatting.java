package day13;

import java.util.Scanner;

public class NameFormatting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=scan.next();
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();


        System.out.println("Enter last name: ");
        String lastName=scan.next();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("Full name: "+firstName+" "+lastName);



    }
}
