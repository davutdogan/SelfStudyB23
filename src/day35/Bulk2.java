package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(numbers);
        list.addAll(Arrays.asList(10, 11, 12, 13, 14, 15));
        System.out.println(list);

        System.out.println("============");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Dilem", "Fhilipp", "Abbos","Kebab", "Abbos", "Abbos"));
        System.out.println(students);

        students.removeAll(Arrays.asList("Dilem", "Fhilipp", "Abbos"));
        System.out.println(students);

    }
}
