package day24;

public class MethodsWithParameter {
    public static void main(String[] args) {
        eligible(21);
    }


    public static void eligible(int age) {
        if (age >= 21) {
            System.out.println("Eligible to buy alcohol!");
        } else {
            System.out.println("Not eligible to buy alcohol!");
        }
    }
}
