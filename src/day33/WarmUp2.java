package day33;

import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = scan.nextInt();
        System.out.println("Enter a number");
        int number2 = scan.nextInt();
        if (number1>number2){
            System.out.println("Maximum number is: "+number1);
        }else {
            System.out.println("Maximum number is: "+number2);
        }

    }

}
