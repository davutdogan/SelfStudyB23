package day13;

import java.util.Scanner;

public class reverse2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a 5 letter word");
        String word=scan.next();

        String reverse="";
        if (word.length()>5 ){
            reverse +="Too long";
        }else if (word.length()<5){
            reverse +="Too short";

        }else{
            reverse+=word.charAt(4);
            reverse+=word.charAt(3);
            reverse+=word.charAt(2);
            reverse+=word.charAt(1);
            reverse+=word.charAt(0);
        }
        System.out.println(reverse);
    }
}
