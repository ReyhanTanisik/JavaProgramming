package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int max=-2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
             int number=scan.nextInt();
             if (number>max){
                 max  =number;
             }



        }
        System.out.println("max = " + max);
        scan.close();
    }
}
