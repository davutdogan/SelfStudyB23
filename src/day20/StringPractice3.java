package day20;

import java.util.Scanner;

public class StringPractice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();

        if (word.length()==3){
            if (word.charAt(1)=='a'){
                System.out.println("cool word");
            }else{
                System.out.println("good word");
            }
        }else {
            if (word.length()>3){
                System.out.println("too long");
            }else {
                System.out.println("too short");
            }
        }

    }
}
