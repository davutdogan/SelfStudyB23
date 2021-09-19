package day25d;

import java.util.Arrays;

public class classmates2 {
    public static void main(String[] args) {
        String names[]={"Emma","Tarik","Ziyad"};

        System.out.println(Arrays.toString(names));

        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i].substring(0,3));
        }
    }
}
