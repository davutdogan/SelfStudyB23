package day25a;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        String days[]={"M","Tu","W","Thu","F","Sa","Sun"};
        System.out.println("Enter a number");
        int n=new Scanner(System.in).nextInt();
        System.out.println(days[n-1]);
    }
}
