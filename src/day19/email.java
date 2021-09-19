package day19;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String [] sepEmail = email.split("@");
        for (int i = 0; i < sepEmail.length; i++) {
            if(sepEmail.length==2){
                System.out.println("Email id: "+sepEmail[i]);
                System.out.println("Email domain: "+sepEmail[i+1]);
                break;
            }else{
                System.out.println("invalid email");
                break;
            }
        }
    }
}
