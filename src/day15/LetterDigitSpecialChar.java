package day15;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {
        String input = "aaabbbbCCCdddd!!!!@@@@###$$$$%%%&&&123456";

        String letter="";
        String digits="";
        String specialChar="";

        for (int i = 0; i <=input.length()-1 ; i++) {
            char each=input.charAt(i);

            if (each>='A'&& each>='Z'){
                letter +=each;
            }else if (each>='a'&&each>='z'){
                letter +=each;

            }else if (each>='0' && each<='9'){
                digits +=each;
            }else{
                specialChar +=each;
            }

        }
        System.out.println("letter = " + letter);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);
    }
}
