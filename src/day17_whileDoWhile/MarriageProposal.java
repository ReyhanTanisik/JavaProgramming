package day17_whileDoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer= scan.next().toLowerCase();
        while(! (answer.equals("yes")|| answer.equals("no"))){
            System.out.println("Invalid response ,please re-enter:");
            answer=scan.next().toLowerCase();

        }
        if (answer.equals("yes")){
            System.out.println("Congratulations!");
        }else{
            System.out.println("Why?!!");
        }
        scan.close();
    }
}
