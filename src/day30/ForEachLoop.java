package day30;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};

        for (int each : arr1) {
            System.out.print(each + " ");

        }
        System.out.println();
        System.out.println("==============");
        int max = arr1[0];
        for (int each : arr1) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println("max = " + max);
    }
}
