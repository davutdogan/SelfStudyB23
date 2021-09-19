package day23;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class SumOfNUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("Enter a number:");
            int n = scan.nextInt();

            if (n < 0) {
                break;
            }

            sum += n;
        }

        System.out.println(sum);
    }
}
