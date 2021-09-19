package day24;

public class FOC {
    public static void main(String[] args) {
        String str = "aabcccd";

        char ch = 'l';
        int frequency = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);
            if (each == ch) {
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
    }
}
