package day17_whileDoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=scan.nextInt();
        System.out.println("Enter second number:");
        int num2=scan.nextInt();
        System.out.println("Enter a math operator");
        char ch=scan.next().charAt(0);
        while (!((ch=='+')|| (ch =='-'))){ //the statement will be realised until the condition becomes false
            System.out.println("Invalid operator, please re-enter:");
            ch=scan.next().charAt(0);
        }
        System.out.println( (ch=='+')? num1+num2 : num1-num2);
        scan.close();
    }
}
