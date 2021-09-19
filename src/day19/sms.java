package day19;

import java.util.Scanner;

public class sms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        String sender=message.substring(message.indexOf("<"))+message.substring(message.indexOf(">"));
        String phoneNumber=message.substring(message.indexOf("["))+message.substring(message.indexOf("]"));
        String messageBody=message.substring(message.indexOf("{"))+message.substring(message.indexOf("}"));


        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+ phoneNumber);
        System.out.println("Message body: "+messageBody);



    }
}
