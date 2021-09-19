package day33;

public class RemoveDup {
    public static void main(String[] args) {

    }

    public static int frequency(int[] array, int element) {
        int count=0;
        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }
}
