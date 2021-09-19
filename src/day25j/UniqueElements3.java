package day25j;

public class UniqueElements3 {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'A', 'C', 'A', 'D', 'D'};

        for (char each : chars) {
            int count = 0;
            for (char characters : chars) {
                if (characters==each){
                    count++;
                }

            }
            if (count==1){
                System.out.println(each);
            }
        }
    }
}
