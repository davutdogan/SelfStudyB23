package day30;

public class FOC2 {
    public static void main(String[] args) {
        String str = "aabccd";

        for (int j = 0; j <= str.length() - 1; j++) {


            char ch = str.charAt(j);
            int frequeny = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    frequeny++;
                }

            }
            //System.out.println(ch + " " + frequeny);
            if (frequeny==1){
                System.out.println(ch);
            }
        }
    }
}
