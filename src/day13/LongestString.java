package day13;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
          String w1=scan.next();
          String w2=scan.next();

          if (w1.length()>=w2.length()){
              System.out.println(w1);

          }else if (w2.length()>=w1.length()){
              System.out.println(w2);
          }else {
              System.out.println("Two words are equal");
          }
          scan.close();
    }
}