package day26_CustomMethodPractice;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = merge(arr1, arr2);

        System.out.println(Arrays.toString(arr3));


        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"D", "E", "F"};

        String[] result = ArraysUtilities.merge(a1, a2);

        System.out.println(Arrays.toString(result));



    }

    public static int [] merge( int [] arr1, int [] arr2){
        int [] result= {};
        for( int each : arr1){
           result= ArraysUtilities.addElement(result,each);
        }
        for( int each : arr2){
          result=   ArraysUtilities.addElement(result,each);
        }
       return result;

        }
}
