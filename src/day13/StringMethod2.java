package day13;

public class StringMethod2 {
    public static void main(String[] args) {
        String sentence = "Java Programming Language";
        //index:           0123
        String name = sentence.substring(0, 3+1);

        System.out.println(name);

        String s2 = "Cybertek School";
        //           0123456789

        String name2 = s2.substring(0, 8);
        System.out.println(name2);

        String name3=s2.substring(9);
        System.out.println(name3);

        String sentence2 = "Java is a programming language";
        String name4=sentence2.substring(10,11).toUpperCase()+sentence2.substring(11).toLowerCase();

        System.out.println( name4);

        String sentence5=sentence2.substring(10,20+1);
        System.out.println(sentence5);

        String sentence6="Python is an easy language";
        sentence6=sentence6.replace("Python","Java");
        System.out.println(sentence6);

        String sentence4 = "C# is a programming language, I like learning C#, C# is the best";
        sentence4 = sentence4.replace("C#" , "Java");

        System.out.println(sentence4);

        String sentence7="I like apple, apple is tasty , apple is juicy";
        sentence7=sentence7.replace("apple","strawberry");
        System.out.println(sentence7);

        String sentence8 = "Dog is friendly, Dog is loyal, I love Dogs";
        sentence8=sentence8.replace("Dog", "Cat");

        System.out.println(sentence8);




    }
}
