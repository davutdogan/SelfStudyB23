package day30;

public class Loops {
    public static void main(String[] args) {

        String anotherWord="Python";

        String reverse="" ;
        for (int i = anotherWord.length()-1; i >=0 ; i--) {
        reverse +=anotherWord.charAt(i);
        }
        System.out.println(reverse);


        System.out.println();
        System.out.println();
        String str="Kadikoy";

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.println(str.charAt(i));
        }

        for (int i = 65; i <=90 ; i++) {
            System.out.print((char) i+" ");
        }
        System.out.println();
        System.out.println("===========");


        for (int i = 65; i <=90 ; i++) {
            System.out.print((char)i+" ");
        }
    }
}
