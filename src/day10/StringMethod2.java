package day10;

import java.util.Scanner;

public class StringMethod2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = scan.next(); // "Apple"
        String word2 =scan.next();

        String result ="";
        if(word1.length() >= 3 && word2.length() >= 3) {
            result = word1.substring(1) + word2.substring(1);
        }else{
            result = "Too Short";
        }
        System.out.println(result);

        scan.close();

    }

}
