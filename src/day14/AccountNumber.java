package day14;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String accounNumber=scan.next();
        char firstChar=accounNumber.charAt(0);

        String result="";

        switch (firstChar){
            case '2':
                if (accounNumber.length()==7){
                    result="Valid account";
                }else{
                    result="Invalid account";
                }
                break;
            case '5':
                if (accounNumber.length()==10){
                    result="Valid account";
                }else {
                    result="Invalid account";
                }
                break;
            default:
        }
        System.out.println(result);
    }
}
