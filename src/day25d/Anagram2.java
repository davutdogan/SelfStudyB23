package day25d;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {


        String w1 = "earth";
        String w2 = "heart";

        char[] result1 = w1.toCharArray();
        char[] result2 = w2.toCharArray();

        Arrays.sort(result1);
        Arrays.sort(result2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));

        boolean isSame=Arrays.equals(result1,result2);
        System.out.println(isSame);
    }
}
