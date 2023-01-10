package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers= {2,34,32,12,87,56,43};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);// on le met dans l'ordre
        System.out.println(Arrays.toString(numbers));
    }
}
