package day15;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scan.nextInt();
        int result=1;

        for (int i = number; i >=1 ; i--) {
            result *=i;

        }
        System.out.println("result = " + result);

    }
}
