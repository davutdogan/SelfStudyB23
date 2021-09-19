package day10;

import java.util.Scanner;

public class StringMethod4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word1=scan.next();
        String word2=scan.next();
        String word3=scan.next();

        boolean allSame=word1.length()==word2.length() && word2.length()==word3.length();
        boolean notSame = word1.length() != word2.length() && word2.length() != word3.length() && word1.length() != word3.length();
        // if none of them have the same length

        if(allSame){
            System.out.println("All words are same length");
        }else if(notSame){
            System.out.println("All different length");
        }else{ // some has lengths some doesn't
            System.out.println("Not Same nor Different lengths");
        }

        scan.close();
    }
}
