package day24;

public class Custom2 {
    public static void main(String[] args) {
        oddNumber(15,28);
    }





    public static void oddNumber(int a,int b){
        for (int i = a; i <=b ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
