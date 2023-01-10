package day17_whileDoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= scan.nextInt();
        while( !(age>=1 && age<=120)){
            System.out.println("Invalid age,please re-enter:");
            age=scan.nextInt();
        }
        System.out.println("Are you Us citizen? Yes or No?");
        String answer= scan.next().toLowerCase();
        while(! (answer.equals("yes")|| answer.equals("no"))){
            System.out.println("Invalid answer , please enter yes or no:");
            answer =scan.next().toLowerCase();
        }
        if (age>=18 && answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
        scan.close();
    }

}
