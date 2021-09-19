package day19;

import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String a=scan.next();

        if (a.toLowerCase().contains("project")&& a.toLowerCase().contains("Alejandro")){
            System.out.println("read");

        }else {
            System.out.println("don't read");
        }
    }
}
