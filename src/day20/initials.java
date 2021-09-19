package day20;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first name:");
        String name=scan.next();
        System.out.println("Enter last name:");
        String last=scan.next();

        System.out.println("Initials: "+name.substring(0,1).toUpperCase()+"."
                +last.substring(0,1).toUpperCase()+".");



    }
}
