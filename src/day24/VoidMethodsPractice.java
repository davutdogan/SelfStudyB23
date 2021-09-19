package day24;

public class VoidMethodsPractice {
    public static void main(String[] args) {
        printEvenNumber(10,20);
        printOddNumber(10,20);

    }



    public static void printOddNumber(int from, int to){
        for (int i = from; i <=to ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void printEvenNumber(int from, int to){
        for (int i = from; i <=to ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
