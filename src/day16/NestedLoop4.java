package day16;

public class NestedLoop4 {
    public static void main(String[] args) {
        for (int i = 1; i <=6 ; i++) {
            for (int j = 0; j <20 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
