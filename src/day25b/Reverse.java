package day25b;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a 5 letter word");
        String word =scan.next();

        char reverse=0;

        char letter4=word.charAt(4);
        char letter3=word.charAt(3);
        char letter2=word.charAt(2);
        char letter1=word.charAt(1);
        char letter0=word.charAt(0);


        System.out.println(letter4+""+letter3+letter2+letter1+letter0);

    }
}
