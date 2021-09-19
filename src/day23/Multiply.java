package day23;

public class Multiply {
    public static void main(String[] args) {
        int a = 5,
                b = 10;
        int result = 0;
        for (int i = 1; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}
