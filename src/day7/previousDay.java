package day7;

import java.util.Scanner;

public class previousDay {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a word:");
        String word=scan.next();

        String reverse=word.charAt(4)+""+word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)+""+word.charAt(0);
        System.out.println(reverse);
    }
}
