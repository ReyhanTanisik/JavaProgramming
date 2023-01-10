package day27_WrapperClasses;

import utilities.ArraysUtilities;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] arr1= {1,1,1,1,3,3,345,5,67,8};
        arr1=removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1));


    }


    public static  int [] removeDuplicates ( int [] array){
        int [] result={};
        for (int each : array){
            if(!(ArraysUtilities.contains(result,each))){
                result= ArraysUtilities.addElement(result,each);
            }
        }
        return result;
    }

    public static  double [] removeDuplicates ( double [] array){
        double [] result={};
        for (double each : array){
            if(!(ArraysUtilities.contains(result,each))){
                result= ArraysUtilities.addElement(result,each);
            }
        }
        return result;
    }

    public static  char [] removeDuplicates ( char [] array){
        char [] result={};
        for (char each : array){
            if(!(ArraysUtilities.contains(result,each))){
                result= ArraysUtilities.addElement(result,each);
            }
        }
        return result;
    }


    public static  String [] removeDuplicates ( String [] array){
        String [] result={};
        for (String each : array){
            if(!(ArraysUtilities.contains(result,each))){
                result= ArraysUtilities.addElement(result,each);
            }
        }
        return result;
    }


}
