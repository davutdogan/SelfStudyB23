package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WM2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2, 2, 3, 4, 5));

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        ArrayList<Integer>uniques= new ArrayList<>(numbers);
        uniques.removeIf(p->Collections.frequency(uniques,p)!=1);
        System.out.println("uniques = " + uniques);
    }
}
