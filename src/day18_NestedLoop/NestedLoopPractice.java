package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age >= 0 && age <= 120)) {
                System.out.println("Invalid age, please re-enter:");
                age = scan.nextInt();
            }

            System.out.println("Would you like to continue?");
            String a= scan.next().toLowerCase();

            while(!( a.equals("yes")|| a.equals("no"))){
                System.out.println("Invalid answer please re -enter an answer:");
                a= scan.next().toLowerCase();

            }

            if(a.equals("no")){
                break;
            }


        }
        scan.close();
    }
}