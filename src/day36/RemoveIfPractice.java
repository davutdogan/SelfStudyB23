package day36;

import day30.Array;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RemoveIfPractice {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        Collections.sort(scores);
        System.out.println(scores);
        Collections.sort(scores);
        System.out.println(scores);
        Collections.swap(scores, 0, 2);
        System.out.println(scores);
        Collections.replaceAll(scores, 73, 85);
        System.out.println(scores);
        Collections.reverse(scores);
        System.out.println(scores);
        int f = Collections.frequency(scores, 85);
        System.out.println(f);

        System.out.println("===================");

        ArrayList<Character> chars1 = new ArrayList<>();
        chars1.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'C', 'D'));

        ArrayList<Character> uniques = new ArrayList<>(chars1);
        uniques.removeIf(p -> Collections.frequency(uniques,p)!=1);
        System.out.println(uniques);


    }
}
