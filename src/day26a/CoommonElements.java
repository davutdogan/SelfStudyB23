package day26a;

public class CoommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8, 9, 10, 11};

        for (int element : arr2) {
            for (int each : arr1) {
                if (each == element) {
                    System.out.println(element);
                }
            }
        }
    }
}
