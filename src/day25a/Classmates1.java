package day25a;

import java.util.Arrays;

public class Classmates1 {
    public static void main(String[] args) {
        String mates[]={"emily","Jake","Vero","Gabby","Jacob"};
        System.out.println(Arrays.toString(mates));
        for (int i = 0; i <mates.length ; i++) {
            System.out.println(mates[i].substring(0,2));

        }

    }
}
