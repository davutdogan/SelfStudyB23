package day17;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {
        String[]classmates={"Ali","Veli","Deli","Hikmet","Mehmet"};
        System.out.println(Arrays.toString(classmates));

        for (int i = 0; i <=classmates.length ; i++) {
            System.out.println(classmates[i].substring(0,3));

        }
    }
}
