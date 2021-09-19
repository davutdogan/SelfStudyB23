package day9;

public class ForLoopP {
    public static void main(String[] args) {
        String Odd="";
        String Even="";
        for (int i = 1; i <=10 ; i++) {
            if (i%2!=0){
                Odd +=i+" ";
            }else {
                Even +=i+" ";
            }

        }
        System.out.println("Odd = " + Odd);
        System.out.println("Even = " + Even);
    }
}
