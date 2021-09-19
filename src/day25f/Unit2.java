package day25f;

import java.util.Scanner;

public class Unit2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        byte[]b=new byte[5];
        for (int j = 0; j <b.length ; j++) {
            b[j]=(byte)(b[j]*2);
        }
        System.out.println(b);

    }
}
