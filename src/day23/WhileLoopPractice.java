package day23;

public class WhileLoopPractice {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
