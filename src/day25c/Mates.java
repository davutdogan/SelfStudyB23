package day25c;

import java.util.Arrays;

public class Mates {
    public static void main(String[] args) {
        String names []={"Jenny","Kerim","Sevim"};

        System.out.println(Arrays.toString(names));

        for (int i = 0; i <names.length ; i++) {
            System.out.println("First 3 letters of name; "
                    +names[i].substring(0,3));
        }


    }
}
