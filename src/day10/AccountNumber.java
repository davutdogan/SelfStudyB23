package day10;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your account number: ");
        String account=scan.next();
        char firstCha=account.charAt(0);

        String result="";

        if( account.length() == 7 || account.length() == 10){
            if(account.charAt(0)  == '2'&& account.length() ==7){ // if the first character is 2 && has 7 characters in total characters
                System.out.println("Valid Account");
            }else if(account.charAt(0)  == '5'&& account.length() ==10){ // if the first character is 2 && has 7 characters in total characters
                System.out.println("Valid Account");
            }else{
                System.out.println("Invalid Account");
            }
        }else{
            System.out.println("Invalid Account");
        }


    }
}
