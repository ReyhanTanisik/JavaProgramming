package day25_OverloadingMethods;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));


        double[] arr2 = {2.4, 5.5, 8.6, 9.9};
        arr2 = addDouble(arr2, 4.3);
        System.out.println(Arrays.toString(arr2));


        char[] chars = {'A', 'B', 'C', 'D'}; //'E'
        chars = addElement(chars, 'E');
        System.out.println(Arrays.toString(chars));

        String[] names = {"Ahmet", "Oleksandr", "Sinem", "Cihad"}; // "Layan"
        names = addElement(names, "Layan");
        System.out.println(Arrays.toString(names));



    }


    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element; // i will be the last element after loop
        return result;

    }

    public static double[] addDouble(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;

        }
        result[i] = element; // i will be the last element after loop
        return result;


    }


    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;
    }
}