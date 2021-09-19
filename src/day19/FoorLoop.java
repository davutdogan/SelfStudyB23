package day19;

public class FoorLoop {
    public static void main(String[] args) {

        String even="";
        String odd="";
        for (int i=0;i<=100;i++){

            if (i%2==0){
                even +=i+", ";
            }
            if (i%2!=0){
                odd +=i+", ";
            }

        }
        System.out.print("even = " + even+"");
        System.out.println();
        System.out.print("odd = " + odd);
    }
}
