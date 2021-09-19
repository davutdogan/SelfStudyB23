package day30;

public class practice3 {
    public static void main(String[] args) {
        for (int i = 1,ch=65; i <=26 ; i++,ch++) {
            System.out.println(i+" "+(char)ch);
        }

        System.out.println("==============");

        for (char i = 'A',j='a'; i <='Z' ; i++,j++) {
            System.out.println(i+" "+j);
        }

        System.out.println("=============");

        for (int i = 96,j=65; i <122 &&j<=90; i++,j++) {
            System.out.print((char)i+" "+(char)j);
        }

        System.out.println("===========");



    }
}
