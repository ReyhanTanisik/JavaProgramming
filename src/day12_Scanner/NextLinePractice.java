package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the age:");
        int age= input.nextInt();
        input.nextLine();
        System.out.println("Enter full name:");
        String name= input.nextLine();
        System.out.println("age = " + age);
        System.out.println("name = " + name);
                input.close();

    }
}
