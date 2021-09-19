package day26a;

public class MaxMinNum {
    public static void main(String[] args) {

        int[][] numbers = {{10, 20, 30}, {40, 50, 60, 70, 80}};

        int max = numbers[0][0];
        int min = numbers[0][0];

        for (int[] each : numbers) {
            for (int element : each) {
                if (element > max) {
                    max = element;
                }
                if (element<min){
                    min=element;

                }
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
