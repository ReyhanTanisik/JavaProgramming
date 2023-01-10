package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {
            for (int i = 1; i < 4; i++) {
                System.out.println("Invalid user name or password please, re - enter username");
                u = scan.next();
                System.out.println("Invalid user name or password please, re - password");
                p = scan.next();


                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }

            }

            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.out.println("Your account is locked, please contact support team");

            }

        }
        scan.close();
    }
}
