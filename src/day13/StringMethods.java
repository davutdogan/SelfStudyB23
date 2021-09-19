package day13;

public class StringMethods {
    public static void main(String[] args) {
        String str="Muhtar";
        char ch=str.charAt(0);
        System.out.println("ch = " + ch);

        String word="Cybertek School";
        char ch2=word.charAt(9);
        System.out.println(ch2);

        String word2="Java";
        char ch3=word2.charAt(2);
        System.out.println("ch3 = " + ch3+"i"+ch3+"a");

        String sentence = "Hello everyone, how are you all today?";
        int totalNumberOfChars = sentence.length();
        System.out.println("totalNumberOfChars = " + totalNumberOfChars);

    }}
