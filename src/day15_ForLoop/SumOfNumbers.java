package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        for(int i= 1; i<=100 ; i++){
           sum+=i;
        }
        System.out.println(sum);


        Scanner scan= new Scanner(System.in);
        int total=0;
        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter a number");
            total += scan.nextInt(); // all input that I give will be added in the total


        }
        System.out.println(total);
        scan.close();

    }
}
