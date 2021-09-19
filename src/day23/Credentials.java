package day23;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String correctUserName = "Adem";
        String corrrectPassword = "123";

        System.out.println("Enter your username: ");
        String u = scan.next();

        System.out.println("Enter your passwor:");
        String p = scan.next();

        if (u.equals(correctUserName) && p.equals(corrrectPassword)) {
            System.out.println("Logged in!");
        } else {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Wrong username or password ");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p=scan.next();

                if (u.equals(correctUserName) && p.equals(corrrectPassword)) {
                    System.out.println("Logged in!");
                    break;

                    }
                if (i==2){
                    System.out.println("your account locked");
                System.exit(0);
                }



            }
        }

        System.out.println("Hello Bello");
    }
}
