package day10;

import java.util.Scanner;

public class SwitchPassOrFail {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number:");
        char grade=scan.next().charAt(0);


        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid entry");



        }
    }
}
