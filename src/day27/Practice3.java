package day27;

public class Practice3 {
    public static void main(String[] args) {
        int [] number={1,2,3,4,1,4,5,1};
        int firstuniqueElement=0;

        int freguency=0;
        for (int i = 0; i <number.length ; i++) {
            if (number[i]==1){
                freguency++;
            }
        }
        System.out.println("freguency = " + freguency);
    }
}
