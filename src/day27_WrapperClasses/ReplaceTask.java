package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceTask {


    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        arr= replace(arr,2,30);
        System.out.println(Arrays.toString(arr));
    }

     public static int [] replace ( int [] array , int index ,int newElement){
         if(index <=0 || index>= array.length){
             System.out.println("Invalid index");
             System.exit(0);
         }
         array[index]= newElement;
         return array;

     }

    public static double [] replace ( double [] array , int index ,double newElement){
        if(index <=0 || index>= array.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }


    public static char [] replace ( char [] array , int index ,char newElement){
        if(index <=0 || index>= array.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }

    public static String [] replace ( String [] array , int index ,String newElement){
        if(index <=0 || index>= array.length){
            System.out.println("Invalid index");
            System.exit(0);
        }
        array[index]= newElement;
        return array;

    }


}
