package day17;

import java.util.Arrays;

public class Classmates2 {
    public static void main(String[] args) {
        String[] classmates = {"Gulistan","Fruza","Ahmet","memet","Muhter","Tamara","Abbos",
                "Shirin","Robinson","Shirin"};
        System.out.println(Arrays.toString(classmates));

        for (int i = 0; i <classmates.length ; i++) {
            System.out.println(classmates[i].substring(0,3));
        }

    }
}
