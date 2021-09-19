package day30;

public class LoopsReview3 {
    public static void main(String[] args) {
        String sentence = "I love Java, Java is fun";

        String word = "Java";
        int count = 0;

        while (sentence.contains(word)) {
            sentence.replaceFirst(word, "");
            count++;
        }

        System.out.println(count);


        for (int i = 0; i <= 10; i++) {

        }

    }
}
