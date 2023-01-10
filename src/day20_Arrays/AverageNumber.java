package day20_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int length= scan.nextInt();
        int[] nums = new int [length];
        int sum=0;

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            nums[i]=scan.nextInt();
            sum +=nums[i];


        }
        double average= sum/length;
        System.out.println("average = " + average);
        scan.close();
    }
}
