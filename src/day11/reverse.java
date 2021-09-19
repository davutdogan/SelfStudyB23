package day11;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();
        String reverse ="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse +=word.charAt(i);



        }
        System.out.println(reverse);
    }
}
