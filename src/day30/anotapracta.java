package day30;

public class anotapracta {
    public static void main(String[] args) {
        String sentence = "I love java , java is cool, java, java";
        String word = "java";
        int count = 0;

        while (sentence.contains(word)) {
            sentence=sentence.replaceFirst("java","");
            count++;
        }
        System.out.println(count);
    }
}
