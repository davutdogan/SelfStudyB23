package day11;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        String odd="";
        String even="";

        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                even +=i+" ";

            }else {
                odd +=i+" ";
            }

        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
