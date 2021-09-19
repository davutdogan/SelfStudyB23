package day25h;

import java.util.Arrays;

public class Merge2Arrays3 {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3},
                nums2[] = {4, 5};

        int nums3[] = new int[nums1.length + nums2.length];
        int j = 0;

        for (int i = 0; i < nums1.length; i++) {
            nums3[j++] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            nums3[j++] = nums2[i];
        }
        System.out.println(Arrays.toString(nums3));
    }
}
