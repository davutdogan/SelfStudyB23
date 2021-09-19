package day23;

public class DoWhileLoop {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int i = 0;

        do {
            if (i % 2 == 0) {
                sumOfEven += i;
            }


            i++;
        } while (i <= 10);
        System.out.println("sumOfEven = " + sumOfEven);


    }
}
