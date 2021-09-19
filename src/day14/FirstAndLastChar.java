package day14;

import java.util.Scanner;

public class FirstAndLastChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();

        String firstLetter=word.substring(0,1);
        String lastLetter=word.substring(word.length()-1);

        if (firstLetter.equalsIgnoreCase(lastLetter)){
            System.out.println("Same");
        }else {
            System.out.println("Different");
        }
    }
}
