package day21;

public class RemoveDuplicate2 {
    public static void main(String[] args) {

        String word = "aabbcc";

        String result = "";
        for (int i = 0; i <= word.length() - 1; i++) {


            if (!result.contains(""+word.charAt(i))){
                result +=word.charAt(i);
            }

        }
        System.out.println("result = " + result);
    }
}
