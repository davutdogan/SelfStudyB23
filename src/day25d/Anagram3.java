package day25d;

import java.util.Arrays;

public class Anagram3 {
    public static void main(String[] args) {
        String s1="race";
        String s2="acer";

        char[]ch1=s1.toCharArray();
        char[]ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAAnagram=Arrays.equals(ch1,ch1);

        System.out.println(isAAnagram);

    }
}
