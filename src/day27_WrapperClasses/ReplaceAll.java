package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {


    public static void main(String[] args) {
        int [] arr= {1,2,4,5,6,78,8,4,4,4,4,4,23,12,11};
        arr= replaceAll(arr,4,13);
        System.out.println( Arrays.toString(arr));


        String [] arr1= { "Reyhan","Cengiz ","Mirza"};
        arr1= replaceAll(arr1,"Reyhan","Mehmet");
        System.out.println(Arrays.toString(arr1));


    }

    public static int [] replaceAll ( int [] array , int oldElement , int newElement){
        for (int i = 0; i < array.length; i++) {

            if( array [i]== oldElement){
                array[i]=newElement;
            }
            
        }
        return array;

        
    }
    public static char [] replaceAll ( char [] array , char oldElement , char newElement){
        for (int i = 0; i < array.length; i++) {

            if( array [i]== oldElement){
                array[i]=newElement;
            }

        }
        return array;


    }


    public static double [] replaceAll ( double [] array , double oldElement , double newElement){
        for (int i = 0; i < array.length; i++) {

            if( array [i]== oldElement){
                array[i]=newElement;
            }

        }
        return array;


    }

    public static String [] replaceAll ( String [] array , String oldElement ,String newElement){
        for (int i = 0; i < array.length; i++) {

            if( array[i].equals(oldElement)){
                array[i]=newElement;
            }

        }
        return array;


    }



}
