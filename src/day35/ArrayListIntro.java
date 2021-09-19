package day35;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(0,20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(15);
        numbers.add(20);
        System.out.println(numbers);
        System.out.println(numbers.get(2));
        System.out.println(numbers.size());
    }
}
