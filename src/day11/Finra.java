package day11;

public class Finra {
    public static void main(String[] args) {
        String result = ""; //1 2 FIN ....

        for (int i = 1; i <= 100 ; i++) {

            // result += (i % 15 == 0 )? "FINRA " :(i % 3 == 0) ? "FIN " :(i%5 ==0)?"RA ": i+" ";

            if (i % 15 == 0 ){
                result += "FINRA ";
            }else if(i % 3 == 0){
                result += "FIN ";
            }else if(i%5 ==0){
                result += "RA ";
            }else{
                result += i+" ";
            }

        }

        System.out.println(result);


    }

}