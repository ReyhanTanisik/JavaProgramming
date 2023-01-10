package day11_SwitchScanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num1= input.nextInt(); // expect to put an integer input

        System.out.println("Enter a decimal:");
        double num2= input.nextDouble(); // expect to put a decimal input

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1*num2));
        input.close();  // close the input , close the scanner



    }
}
