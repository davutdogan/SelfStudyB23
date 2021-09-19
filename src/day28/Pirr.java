package day28;

public class Pirr {
    public static void main(String[] args) {
        oddNumbers(13,29);

    }


    public static void oddNumbers(int from ,int to){
        for (int i = from; i <=to ; i++) {
            if (i%2 !=0){
                System.out.print(i+" ");
            }
        }
    }
}
