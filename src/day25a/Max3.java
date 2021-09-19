package day25a;

public class Max3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int max = 0;

        for (int i = 0; i <=numbers.length-1 ; i++) {
            int each=numbers[i];
            if (each>max){
                max=each;
            }

        }
        System.out.println(max);

    }
}
