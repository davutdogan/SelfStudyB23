package day26a;

public class MDA2 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5}, {6, 7, 8}};

        for (int[] each : arr2D) {
            for (int element : each) {
                System.out.print(element+" ");
            }
        }
    }
}
