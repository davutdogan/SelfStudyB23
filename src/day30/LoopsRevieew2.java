package day30;

import java.util.Scanner;

public class LoopsRevieew2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        int n = 0;

        while (!answer.equals("no")) {
            System.out.println("Enter a number");
            n = scan.nextInt();
            System.out.println("Would you like to add another number");
            answer = scan.next();
            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid answer,Would you like to add another number");
                answer = scan.next();
            }
        }
    }
}
