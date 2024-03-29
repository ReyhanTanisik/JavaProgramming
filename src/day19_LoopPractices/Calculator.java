package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a first number:");
        int num1= scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator=scan.next().charAt(0);

        if (!(( operator=='+')|| (operator=='-'))){
            System.err.println("Invalid operator "+operator);
            System.exit(0); // terminates the whole program
        }

        System.out.println("Enter second number:");
        int num2= scan.nextInt();

        if (operator=='-'){
            System.out.println(num1-num2);
        }else{
            System.out.println(num1+num2);
        }

        scan.close();
    }
}
