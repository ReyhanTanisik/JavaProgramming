package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        String [][] groups= new String[3][];


        String[] group1={"can","ali","sevde"};
        String[] group2={"enes","gökhan","emre"};
        String[] group3={"zeynep","büşra","reyhan"};

        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));

        int [][] arr2D={ {1,2,3},{4,5,6},{7,8,9,10}};
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][2]);
    }
}
