package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap2Array {
    public static void main(String[] args) {
        String names[] = {"A", "B", "C", "D"};
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList(names));
        Collections.swap(students, 0, students.size() - 1);
        System.out.println(students);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10));
        int firstUnique = 0;
        for (Integer each : list) {
            if (Collections.frequency(list, each) == 1) {
                firstUnique = each;
                break;
            }
        }
        System.out.println(firstUnique);
    }
}
