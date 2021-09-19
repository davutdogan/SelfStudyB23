package day6;

public class StringMethods {
    public static void main(String[] args) {
        String str="Muhtar";
        char ch1=str.charAt(0);
        System.out.println(ch1);

        String st2="Cybertek School";
        char ch2=st2.charAt(9);
        System.out.println(ch2);

        String word2="Java";
        char ch3=word2.charAt(2);
        System.out.println(ch3);

        String s1="Cybertek";
        char firstCharacter=s1.charAt(0);

        int lastIndex=s1.length()-1;
        char lastCharacter=s1.charAt(lastIndex);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);





        String n1="Michaela Torl";
        char firstCha=n1.charAt(0);

        int lastIndex23=n1.length()-1;
        char lastCha=n1.charAt(lastIndex23);

        System.out.println("firstCha = " + firstCha);
        System.out.println("lastCha = " + lastCha);

        String word54="Sacremento";
        char firstcha54=word54.charAt(0);

        int lastIndex54=word54.length()-1;
        char lastcha54=word54.charAt(lastIndex54);

        System.out.println("firstcha54 = " + firstcha54);
        System.out.println("lastcha54 = " + lastcha54);



        String word55= "welcome";
        char firstCha55=word55.charAt(0);

        int lastIndex55=word55.length()-1;
        char lastCha55=word55.charAt(lastIndex55);

        System.out.println("firstCha55 = " + firstCha55);
        System.out.println("lastCha55 = " + lastCha55);

        word55=word55.toUpperCase();
        System.out.println(word55);

        String name55="Cabbar";
        name55=name55.toUpperCase();
        System.out.println("name55 = " + name55);

        String name56="          Abuzer Kadaayif";
        name56=name56.trim();
        System.out.println(name56);








    }
}
