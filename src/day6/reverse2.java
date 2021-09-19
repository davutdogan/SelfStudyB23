package day6;

import java.util.Scanner;

public class reverse2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();

        String result="";
        if (word.length()<5){
            System.out.println("Too short");
        }else if (word.length()>5){
            System.out.println("Too long");
        }else{
            result=""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        }
        System.out.println(result);

    }
}
