package day17_whileDoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {
            if (i=='F'){
                break; //il sort du loop
            }
            System.out.print(i+" ");


        }
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Enter a number:");
            int number= scan.nextInt();

            if(number<0){
                break;
            }

        }
    }
}
