package day29;

import java.util.Arrays;

public class PracticeForEach {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3},
                nums2[] = {5, 6};

        int num3[] = new int[nums1.length + nums2.length];

        int j = 0;
        for (int each : nums1) {
            num3[j++] = each;
        }
        for (int each : nums2) {
            num3[j++] = each;
        }
        System.out.println(Arrays.toString(num3));

    }

}
