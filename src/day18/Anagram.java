package day18;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram=Arrays.equals(ch1,ch2);
        System.out.println("isAnagram = " + isAnagram);

    }
}
