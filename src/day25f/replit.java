package day25f;

import java.util.Arrays;
import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        // Do not touch above
        String shortest=str[0];
        for (int i = 0; i <str.length ; i++) {
            if (str[i].length()<shortest.length()){
                shortest=str[i];
            }
        }
        System.out.println(shortest);

    }
}
