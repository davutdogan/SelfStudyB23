package day15;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        String result = "";
        for (int i = 65; i <=90; i++) {
            result +=(char)i+",";
        }
        System.out.println(result);
        System.out.println();

        for (char i = 'A'; i <='Z' ; i++) {

            System.out.print(i+", ");

        }
        System.out.println();

        for (char i = 'z';  i>='a' ; i--) {
            System.out.print(i+", ");
        }
    }
}
