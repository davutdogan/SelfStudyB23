package day15;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        int a = 10,
                b = 5;

        int result = 0;

        for (int i = 0; i < b; i++) {
            result += a;
        }

        System.out.println("result = " + result);


    }
}