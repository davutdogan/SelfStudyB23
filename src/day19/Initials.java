package day19;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first name:");
       char firstName=scan.next().charAt(0);

        System.out.println("Enter your last name:");
        char lastName=scan.next().charAt(0);


        System.out.println("Initials:"+firstName+"."+lastName+".");



    }
}
