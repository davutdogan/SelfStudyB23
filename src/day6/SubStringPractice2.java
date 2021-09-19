package day6;

public class SubStringPractice2 {
    public static void main(String[] args) {
        String nameOfSong="bizim oglan asiktir dilo dilo yaylalar";
        String theBestPart=nameOfSong.substring(30);
        System.out.println(theBestPart);

        String bestMovie="Shawshank redemption";
        String secondWord=bestMovie.substring(10);
        System.out.println(secondWord);

        String sentence = "My favorite TV series is The Walking Dead";
        String tvSeries = sentence.substring(25);

        System.out.println(tvSeries);

        String sentence2 = "Java is a fun language";
        String s1 = sentence2.substring(10,12);
        System.out.println(s1);

        String s2 = sentence2.substring(14);
        System.out.println(s2);

    }
}
