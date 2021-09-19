package day15;

public class ForLoopPractice {
    public static void main(String[] args) {


        String odd="";
        String even="";

        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
           even +=i+", ";
            }else if (i%2!=0){

                odd +=i+", ";
            }

        }
        System.out.println("odds = " + odd);
        System.out.println("evens = " + even);

    }
}
