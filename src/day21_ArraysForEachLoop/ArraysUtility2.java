package day21_ArraysForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String [] students= { "Alican","Kalbinur","Ali","Erdem","İzel","Reyhan","Ömer"};
        String [] earlyBirds= Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));

        char[] ch1= {'A','B','C','E','F','G','H','I','J'};
        char[] ch2=Arrays.copyOfRange(ch1,2,6);
        System.out.println(Arrays.toString(ch2));

        int[] scores={10,20,30,40,50,60,70,80,90,100};
        int[] result=Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));


    }
}
