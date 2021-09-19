package day16;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        String[]months={"o","s","mart","n","mayis","h"};
        System.out.println("Enter a number");
        int n=new Scanner(System.in).nextInt();
        if(n>=1 && n<=12) {
            System.out.println(months[n - 1]); // index: 12
        }else{
            System.out.println("Invalid Number");
        }

    }
}
