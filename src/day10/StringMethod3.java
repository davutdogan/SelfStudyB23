package day10;

import java.util.Scanner;

public class StringMethod3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();

        String result="";

        if (word.length()==3){
            if (word.charAt(1)=='a'){
                result="Cool word";
            }else{
                result="Good word";
            }
        }else {
            if (word.length()>3){
                result="Too long";
            }else {
                result="Too short";
            }
        }
        System.out.println(result);
    }
}
