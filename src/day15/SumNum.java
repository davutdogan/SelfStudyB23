package day15;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter a number");
            result += scan.nextInt();


        }
        System.out.println("numbers total= " + result);


    }
}