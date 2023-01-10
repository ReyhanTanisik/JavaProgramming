package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName =input.nextLine(); // read everything until you press the enter

        System.out.println(" Enter programming language:");
        String programming =input.nextLine();

        System.out.println("Enter your age:");
        int age= input.nextInt();

        input.nextLine(); // it will read the enter right before

        System.out.println("Enter your school name ;");
        String school= input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("school = " + school);
        input.close();
    }
}
