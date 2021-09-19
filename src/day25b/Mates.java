package day25b;

import java.util.Arrays;

public class Mates {
    public static void main(String[] args) {
        String names[]={"Ashley","Mike","Shayna"};
        System.out.println(Arrays.toString(names));

        for (int i = 0; i <=names.length-1 ; i++) {
            System.out.println(names[i].substring(0,3));
        }
    }
}
