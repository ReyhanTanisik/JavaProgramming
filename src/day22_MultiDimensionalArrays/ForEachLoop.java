package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [][] arr2D= {{1,2,3,4},{5,6,7,8},{9,10,11,12,13}};

        for (int [] each1D: arr2D){
           for ( int eachElement : each1D){
               System.out.print(eachElement+" ");

           }
        }


        }
    }

