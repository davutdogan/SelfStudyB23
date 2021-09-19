package day32;

public class NewWarmUp {
    public static void main(String[] args) {
       int sum2= sumOf2Num(10,4);
        System.out.println("sum1 = " + sum2);
       int sum3=sumOf3Num(1,4,3);
        System.out.println(sum3);

    }
    public static int sumOf3Num(int a,int b,int c){
        return a+b+c;
    }

    public static int sumOf2Num(int a,int b){
        return a+b;
    }
}
