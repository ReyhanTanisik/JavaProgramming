package day17_whileDoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your user name:");
        String u= scan.next();
        System.out.println("Enter your password:");
        String p=scan.next();
        if (u.equals("Cydeo")&& p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            System.out.println("Username or password is invalid.");
        }
        int attempt=3;
        while( !(u.equals("Cydeo")&& p.equals("Cydeo123")) && attempt>0 ){
            System.out.println("Invalid username or password :");
            System.out.println("Please re- enter user name:");
            u=scan.next();
            System.out.println("please re-enter password :");
            p=scan.next();
            attempt--;


        }
        if (u.equals("Cydeo")&& p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            System.out.println("Your account is locked.");
        }
        scan.close();

    }
}
