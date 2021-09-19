package day25e;

import java.util.Arrays;

public class mates {
    public static void main(String[] args) {
        String mates[]={"Azim","Ile","Sican","Duvari","delermis"};

        System.out.println(Arrays.toString(mates));

        for (int i = 0; i <mates.length ; i++) {
            System.out.println(mates[i].substring(0,3));
        }


    }
}
