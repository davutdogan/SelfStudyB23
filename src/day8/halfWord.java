package day8;

import java.util.Scanner;

public class halfWord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        int halfword=(word.length())/2;
        String middle=word.substring(halfword);
        System.out.println(middle+middle);
    }
}
