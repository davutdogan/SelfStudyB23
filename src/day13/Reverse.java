package day13;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a 5 letter word");
        String reverse= scan.next();

        String result="";
        if (reverse.length()>5){
            result="Too long";
        }else if(reverse.length()<5){
            System.out.println("Too short");
        }else{
            result +=reverse.charAt(4);
            result +=reverse.charAt(3);
            result +=reverse.charAt(2);
            result +=reverse.charAt(1);
            result +=reverse.charAt(0);
        }

        System.out.println(result);
    }

}
