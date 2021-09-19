package day18;

import java.util.Arrays;

public class StringMethod6 {
    public static void main(String[] args) {

        String sentence="Her bahar biraz daha fazla asigim";

        String[] word=sentence.split(" ");

        for (int i = word.length-1; i >=0 ; i--) {
            System.out.print(word[i]+" ");
        }

        System.out.println();


        String str="!@#$%^&";

        char[] character=str.toCharArray();
        System.out.println(Arrays.toString(character));
    }
}
