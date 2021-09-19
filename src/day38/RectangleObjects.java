package day38;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
       /* rectangle1.width=30;
        rectangle1.length=20;

        rectangle1.getInfo();*/

        rectangle1.setInfo(30,20);
        rectangle1.getInfo();

        Rectangle rectangle2=new Rectangle();

        rectangle2.setInfo(12,15);
        rectangle2.getInfo();
        System.out.println("===============================");
        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
