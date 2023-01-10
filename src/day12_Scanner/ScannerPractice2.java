package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter true/false");
       // boolean result= input.nextBoolean();
        System.out.println("Enter your name:");
        String name= input.next(); // read the string input only until the space, it cannot read more than one word
        System.out.println("name = " + name);
        input.close();

    }
}
