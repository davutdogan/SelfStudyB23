package day25a;

public class max2 {
    public static void main(String[] args) {
        int number[] = {1, 2, 3,150, 4, 5, 6, 7};

        int max = 0;
        int min=0;

        for (int i = 0; i <=number.length-1 ; i++) {
            int each=number[i];
            if (each > max) {

                max=each;
            }
            if (each<min){
                min=each;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
