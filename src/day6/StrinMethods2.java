package day6;

public class StrinMethods2 {
    public static void main(String[] args) {
        String name="Welcome to the paradise";
        name=name.substring(15);
        System.out.println(name);

        String name1="Welcome to the paradise";
        //            0123456
        name1=name1.substring(0,7);
        System.out.println(name1);

        name1=name1.substring(3,6+1);
        System.out.println(name1);


        String sentence= "Python is an easy language";
        sentence=sentence.replace("Python","Java");
        System.out.println(sentence);












    }
}
