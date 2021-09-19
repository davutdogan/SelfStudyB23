package day19;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 letter word");
        String word=scan.next();
        String reverse="";
        reverse +=word.charAt(4);
        reverse +=word.charAt(3);
        reverse +=word.charAt(2);
        reverse +=word.charAt(1);
        reverse +=word.charAt(0);

        System.out.print(reverse);
    }
}
