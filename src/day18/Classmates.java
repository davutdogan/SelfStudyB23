package day18;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {
        String[] classmates={"Jimmy","Mike","Muhtar","Tarik"};

        System.out.println(Arrays.toString(classmates));

        for (int i = classmates.length-1; i >0 ; i--) {
            System.out.println(classmates[i].substring(0,3));
        }



    }
}
