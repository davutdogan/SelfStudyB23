package day25e;

public class Multiplication {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}
