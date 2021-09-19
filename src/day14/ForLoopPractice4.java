package day14;

import java.util.Scanner;

public class ForLoopPractice4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number =scan.nextInt();
        int sum=0;

        for (int i = sum; i <=number; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
