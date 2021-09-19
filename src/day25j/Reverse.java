package day25j;

public class Reverse {
    public static void main(String[] args) {
        String[] arr = {"Java", "C#", "Python", "Something"};
        for (String element:arr   ) {
            String reverse="";

            for (int i = element.length()-1; i >=0 ; i--) {
                reverse+=element.charAt(i);
            }
            System.out.print(reverse+" ");
        }

    }
}
