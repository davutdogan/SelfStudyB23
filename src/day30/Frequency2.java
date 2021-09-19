package day30;

public class Frequency2 {
    public static void main(String[] args) {
        String str = "aabcccd";


        for (int j = 0; j <= str.length() - 1; j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            System.out.println(ch +"-"+frequency);
           /* if (frequency == 1) {
                System.out.println(ch);
            }*/
        }
    }
}
