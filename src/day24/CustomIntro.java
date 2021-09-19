package day24;

public class CustomIntro {
    public static void main(String[] args) {
        printHello5Times();
        System.out.println();
        System.out.println("Davut");
        printHello5Times();
        System.out.println();
        System.out.println("Cybertek");
        printHello5Times();
    }


    public static void printHello5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.print("hello ");
        }
    }
}
