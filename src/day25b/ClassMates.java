package day25b;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {
        String mate[]={"Jenny","Emma","Vero"};
        System.out.println(Arrays.toString(mate));

        for (int i = 0; i <=mate.length-1 ; i++) {
            System.out.println(mate[i].substring(0,3));
        }
    }
}
