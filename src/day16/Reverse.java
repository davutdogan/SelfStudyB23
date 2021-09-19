package day16;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();

        String length="";
        for (int i = word.length()-1; i>=0 ; i--) {
            length +=word.charAt(i);

        }
        System.out.println(length);
    }
}
