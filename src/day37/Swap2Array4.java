package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap2Array4 {
    public static void main(String[] args) {
        String[] names = {"a", "b", "c"};

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList(names));
        Collections.swap(students,0,students.size()-1);
        System.out.println(students);
    }
}
