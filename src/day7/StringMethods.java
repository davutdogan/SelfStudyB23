package day7;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word=scan.next();
        int middle=(word.length())/2;
        String halfWord=word.substring(0,middle);
        System.out.println(halfWord+halfWord);

    }
}
