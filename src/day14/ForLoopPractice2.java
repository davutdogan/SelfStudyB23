package day14;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println();

        for (char i = 'z'; i >='a' ; i--) {
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println();
        for (int i = 65; i <=90 ; i++) {
            System.out.print((char)+i+", ");

        }
    }
}
