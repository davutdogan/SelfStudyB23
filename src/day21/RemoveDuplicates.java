package day21;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word="aabbc";
        String result="";

        if (!result.contains(""+word.charAt(0))){
            result +=word.charAt(0);
        }
    }
}
