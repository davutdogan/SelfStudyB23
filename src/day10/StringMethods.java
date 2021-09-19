package day10;

public class StringMethods {
    public static void main(String[] args) {
        String email = "Cybertek@yahoo.com";
        email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);


        String sentence = "C# is cool, C# is fun";
        sentence = sentence.replace("C#", "Java");
        System.out.println("sentence = " + sentence);

        String s = "Cat Dog Cat Dog Cat";
        //s=s.replace("Cat","Dog");
        //System.out.println("s = " + s);
        s = s.replaceFirst("Cat", "Dog");
        System.out.println("s = " + s);



    }
}
