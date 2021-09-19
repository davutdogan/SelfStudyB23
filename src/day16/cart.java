package day16;
import java.util.Scanner;
public class cart {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
    String result="";
    if(word.length()<5){
        result="Too short!";
    }else if(word.length()>5){
        result="Too long!";
    }else{
        result += word.charAt(4);
        result +=word.charAt(3);
        result +=word.charAt(2);
        result +=word.charAt(1);
        result +=word.charAt(0);
    }
    System.out.println(result);



}
}