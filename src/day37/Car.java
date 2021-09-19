package day37;

public class Car {
    public String make;
    public String model;
    public String color;
    public int price;
    public int year;

    public void driver(String drive){
        System.out.println( " driver is driving "+make+" "+model);
    }

    public void setInfo(String carMake,String carModel,String carColor, int carPrice,int carYear){
        make=carMake;
        model=carModel;
        color=carColor;
        price=carPrice;
        year=carYear;


    }
    public void getInfo(){
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
        System.out.println("year = " + year);
    }
}
