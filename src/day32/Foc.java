package day32;

public class Foc {
    public static void main(String[] args) {
        String str="aabbcd";
        for (int j = 0; j <str.length()-1 ; j++) {


            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.println(ch);
            }
        }
        //System.out.println(ch+"frequency = " + frequency);

    }
}
