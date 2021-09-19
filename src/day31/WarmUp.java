package day31;

import utilities.StringUtility;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        String word = "Acildi acilacak tum kapilar azcik gayret azcik sabret";
        System.out.println(StringUtility.reverse(word));

        String word2 = "aabcccdeetzzzzkkkz";
        // System.out.println(removeDup(word2));
        System.out.println(removeDup(word2));


        String word3="race";
        String word4="care";
        System.out.println(isAnagram(word3,word4));

        String word5="aabbcddde";
       int n= frequency(word5,'a');
        System.out.println("n = " + n);


    }
    public static String uniqueChars(String s){
        String unique="";
        for (int i = 0; i <s.length()-1 ; i++) {
            char each=s.charAt(i);
            int frequency=frequency(s,each);
            if (frequency==1){
                unique+=each;
            }
        }
        return unique;
    }
    public static int frequency(String str,char ch){
        int count=0;
        for (char each : str.toCharArray()) {
            if (each==ch){
                count++;
            }
        }
        return count;
    }
    public static boolean isAnagram(String str1, String str2) {
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
    public static String removeDup(String str) {
        String result = "";

        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) < 0) {
                result += ch;
            }
        }
        return result;
//istanbuL!!!2021@@@
    }
}
