package day25d;

import java.util.Scanner;

public class SumOfNUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int sum = 1;

        for (int i = 1; i <=number; i++) {
            sum *= i;
        }
        System.out.println("Total: "+sum);
    }
}
