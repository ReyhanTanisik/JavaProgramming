package day25_OverloadingMethods;

import utilities.ArraysUtilities;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtilities.printEach(arr1);



        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtilities.printEach(arr2);

        System.out.println("--------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtilities.printEach(arr3);

        System.out.println("--------------------------------");

        String[] names = {"David", "Elvira", "Ali", "Igor"};

        ArraysUtilities.printEach(names);

        int[] n1 = {10,2,3,4,5,6};

        int max1 = ArraysUtilities.max(n1);

        System.out.println("max1 = " + max1);

        System.out.println("--------------------------------");

        double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.5};

        double max2 = ArraysUtilities.max(n2);

        System.out.println("max2 = " + max2);

        System.out.println("--------------------------------");



        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtilities.contains(a1, 10);





    }
}
