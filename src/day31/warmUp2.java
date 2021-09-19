package day31;

public class warmUp2 {
    public static void main(String[] args) {
        String sentence = "Java java JaVA";
        String word = "java";
        System.out.println(frequencyOfWord(sentence, word));


    }
    public static int frequencyOfWord(String sentence, String word){
        int count=0;
        sentence=sentence.toLowerCase();
        word=word.toLowerCase();
        while (sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            count++;
        }
        return count;
    }

}
