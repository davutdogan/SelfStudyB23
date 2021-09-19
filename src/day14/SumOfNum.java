package day14;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Enter numbers");
             sum =scan.nextInt();


        }
        System.out.println("sum = " + sum);
    }
}
