package day37;

import day30.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap2Array2 {
    public static void main(String[] args) {
        String []names={"A","B","C","D"};
        ArrayList<String>students=new ArrayList<>();

        students.addAll(Arrays.asList(names));
        Collections.swap(students,0,students.size()-1);
    }
}
