package day7;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        String sentence = "My favorite TV series is The Walking dead ";
        String s1 = sentence.substring(25);
        System.out.println(s1);


        String name="Davut";
        String restOfName=name.substring(3);
        System.out.println(restOfName);

        String data="There are 100 trees";
        String d1=data.substring(10,12+1);
        System.out.println(d1);

        String sentence2="Java is a fun language";
        String s2=sentence2.substring(10,12+1);
        System.out.println(s2);

        String s3 = sentence2.substring(14);
        System.out.println(s3);




    }}
