package day21_ArraysForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="acdb";
        String str2="bcda";

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean result= Arrays.equals(ch1,ch2);
        System.out.println(result);
    }
}
