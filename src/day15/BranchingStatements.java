package day15;

public class BranchingStatements {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){
            if(i==4){
                break; // exit the loop
            }

            System.out.print(i+" ");

        }
        System.out.println("-----------------------------------------------");

        for(int i = 0; i <= 5; i++){

            if(i == 3){
                continue;  // skip
            }

            System.out.print(i+" ");

        }
        System.out.println();
        for (int i = 1; i <=10 ; i++) {
            if (i%2==0){
                continue;
            }
            System.out.print(i+", ");

        }

        System.out.println();

        for (char i = 'A'; i <='Z'; i++) {
            if (i=='D'||i=='T'||i=='Z'){
                continue;
            }
            System.out.print(i+", ");

        }


        System.out.println();

        for (int i = 1; i <=100 ; i++) {
            if (i%15!=0){
                continue;
            }
            System.out.print(i+" ");
        }




    }
}
