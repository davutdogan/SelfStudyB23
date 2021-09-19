package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10));
        System.out.println(list);

        ArrayList<Integer>uniques=new ArrayList<>(list);
        uniques.removeIf(p-> Collections.frequency(uniques,p)!=1);
        int firstUnique=uniques.get(0);

        System.out.println(uniques);
    }
}
