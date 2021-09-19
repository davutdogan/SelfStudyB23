package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WM2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,11,12,13,14,15));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.swap(list,0,2);
        System.out.println(list);


    }
}
