package day28;

public class VoidMethodsPractice {
    public static void main(String[] args) {
        printOddNumber(3,37);
        printEvenNumbers(10,20);
        printEvenNumbers(5,23);
        calculateAge(1985);

    }


    public static void  printOddNumber(int from , int to){
        for (int i = from; i <=to ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void printEvenNumbers(int from,int to){
        for (int i = from; i <=to ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void calculateAge(int birthYear){
        System.out.println("Your age is: "+(2021-birthYear));
    }
}
