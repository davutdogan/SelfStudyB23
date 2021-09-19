package day15;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {


        String result="";
        for (int i = 1; i <=100 ; i++) {


            if (i % 15 == 0) {
                result += "Finra, ";
            } else if (i % 3 == 0) {
                result += "Fin, ";
            } else if (i % 5 == 0) {
                result += "Ra, ";
            } else {
                result +=i+", ";

            }
        }
        System.out.print(result);
    }
}
