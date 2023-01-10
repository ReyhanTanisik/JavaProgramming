package day21_ArraysForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] scores={83,45,57,89,39};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("Minimum number is "+scores[0]);
        System.out.println("Maximum number is "+scores[scores.length-1]);

        String[] names= {"Nur","Erdem","Ali","İzel","Reyhan"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int [] arr1= {1,3,2};
        int [] arr2={1,2,3};

        boolean result= Arrays.equals(arr1,arr2);
        System.out.println(result);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2= Arrays.equals(arr1,arr2);
        System.out.println(r2);

        char [] c1= {'a','b','c'};
        char[] c2={'b','a','c'};

        Arrays.sort(c1);
        Arrays.sort(c2);

       boolean r3= Arrays.equals(c1,c2);
        System.out.println(r3);

    }
}
