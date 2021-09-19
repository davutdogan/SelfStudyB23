package day11;

public class ForLoopIntroPractice {
    public static void main(String[] args) {
        for (int i = 0; i <=100 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("=========");

        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){

                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("============");
        }
        String odd="";
        String even="";
        for (int i = 0; i <=100 ; i++) {
            if (i%2!=0){
                odd +=i+" ";
            }else {
                even +=i+" ";
            }

        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);

    }
}
