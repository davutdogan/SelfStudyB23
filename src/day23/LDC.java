package day23;

public class LDC {
    public static void main(String[] args) {

        String input = "mn@123Ab!";
        String letters = "";
        String digits = "";
        String specialLetter = "";

        for (int i = 0; i <= input.length() - 1; i++) {
            char each = input.charAt(i);
            if (each >= 'A' && each <= 'Z') {
                letters += each;
            }

        }
        System.out.println(letters);
    }
}
