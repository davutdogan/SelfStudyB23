package day25c;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String sentence = "I love java programming";
       String[]word= sentence.split(" ");
        System.out.println(Arrays.toString(word));


        for (int i = word.length-1; i >=0 ; i--) {
            System.out.print(word[i]+" ");
        }
        System.out.println();


        String email="dvtdgn45@gmail.com";
        String name=email.split("@")[0];

        System.out.println("name = " + name);





        String email2="Ahmet@gmail.com";
        String firstName=email2.split("@")[0];
        System.out.println("firstName = " + firstName);

        String str="Davut";

        char[]characters=str.toCharArray();
        System.out.println(Arrays.toString(characters));

    }
}
