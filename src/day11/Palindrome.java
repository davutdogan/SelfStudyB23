package day11;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        String reverseWord="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverseWord+=word.charAt(i);

        }

        System.out.println(reverseWord);
        scan.close();
    }
}
