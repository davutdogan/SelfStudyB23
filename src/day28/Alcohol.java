package day28;

public class Alcohol {
    public static void main(String[] args) {
        eligible(15);
    }


    public  static void eligible(int age){
        if (age>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible");
        }
    }
}
