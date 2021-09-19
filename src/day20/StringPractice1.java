package day20;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scan.next();

        String wordlength = "";
        System.out.println(word.substring(word.length() - 3));
        System.out.println(word.substring(0, 3));

        scan.close();

    }
}
