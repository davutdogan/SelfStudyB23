package day30;

public class Practice2 {
    public static void main(String[] args) {
        int x=10;
        int y=20;

        System.out.println("Before the swap");
        System.out.println("x value is "+x);
        System.out.println("y value is "+y);

        int temp=x;
         x=y;
         y=temp;

        System.out.println("After the swap");
        System.out.println("x value is "+x);
        System.out.println("y value is "+y);

    }
}
