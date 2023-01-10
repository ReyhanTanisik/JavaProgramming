package day21_ArraysForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50};
        int[] reversed= new int[numbers.length];

        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) { //number of iteration is same for i and j so we don't put twice iteration condition
            reversed[j]=numbers[i];



        }
        System.out.println(Arrays.toString(reversed));
    }
}
