package day25a;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String []months={"j","f","m","a","may","jun","july","au","s","o","n","d"};

        System.out.println("Enter a num");
        int n=new Scanner(System.in).nextInt();

        System.out.println(months[n-1]);
    }
}
