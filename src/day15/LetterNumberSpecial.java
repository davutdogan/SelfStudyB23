package day15;

import java.util.Scanner;

public class LetterNumberSpecial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input = "aaabbbbCCCdddd!!!!@@@@###$$$$%%%&&&123456";

    String letters="";
    String numbers="";
    String specialCha="";

        for (int i = 0; i <= input.length()-1 ; i++) {
            char each = input.charAt(i); // gets each characters from the string

            if(each >= 'A' && each <= 'Z'){ //if the character is upper case letter
                letters += each;
            }else if(each >= 'a' && each <= 'z'){ // if the character is lower case letter
                letters += each;
            }else if(each>='0' && each <= '9'){ // if the character is digit
                numbers += each;
            }else{ // if the character is special char
                specialCha += each;
            }

        }

    }
}
