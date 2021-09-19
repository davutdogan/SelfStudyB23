package day37;

public class CarLot {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.make="Maserati";
        car1.model="Lavente";
        car1.color="Blue";
        car1.price=65000;
        car1.year=2022;

        car1.getInfo();

        car1.driver("smart");
        System.out.println();
    }
}
