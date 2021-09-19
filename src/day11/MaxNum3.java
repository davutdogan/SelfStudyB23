package day11;

import java.util.Scanner;

public class MaxNum3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int max=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int n=scan.nextInt();

            if (n>max){
                max=n;
            }

        }
        System.out.println("max = " + max);
        scan.close();
    }
}
