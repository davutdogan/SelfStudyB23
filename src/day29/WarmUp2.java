package day29;

import java.util.Arrays;

public class WarmUp2 {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3},
                nums2[] = {5, 6, 7};
        m2Array(nums1,nums2);

    }

    public static void m2Array(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length + arr2.length];

        int j = 0;
        for (int each : arr1) {
            arr3[j++] = each;
        }
        for (int each : arr2) {
            arr3[j++] = each;
        }
        System.out.println(Arrays.toString(arr3)
        );

    }

}
