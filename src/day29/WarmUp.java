package day29;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        printMaxNumber(15,7);
        fullName("oRHaN","vElI");
        posNegZero(10);
        posNegZero(-5);
        posNegZero(0);

        int numbers[] = {1, 2, -40, 0, 3, -5};

        for (int number : numbers) {
            posNegZero(number);
        }
        System.out.println();
        int nums1[] = {1, 2, 3},
                nums2[] = {5, 6, 7};
        mergeTwoArrays(nums1, nums2);
        System.out.println("====================");
        fullName("daVuT","dOGAN");


    }
    public static void printMaxNumber(int num1,int num2){
        if (num1>num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }
    public static void fullName(String firstName,String lastName){
       firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
    lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

    String fullName=firstName+" "+lastName;
        System.out.println(fullName);
    }

    public static void posNegZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println(number + " is zero");
        }
    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each : arr2) {
            arr3[i++] = each;
        }
        System.out.println(Arrays.toString(arr3));
    }


}


