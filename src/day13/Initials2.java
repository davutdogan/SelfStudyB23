package day13;

import java.util.Scanner;

public class Initials2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scan.next().substring(0,1).toUpperCase();

        System.out.println("Enter your last name");
        char ln=scan.next().charAt(0);


        System.out.println("Initials: "+name+"."+ln+".");
    }
}
