package day21_ArraysForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java";
        char[] chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for ( char each :str.toCharArray()){
            System.out.println(each);

        }

        String sentence="Wooden spoon";
       String[] words =sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String email="WoodenSpoon@cydeo.com";
        String[] arr= email.split("@");
        System.out.println(Arrays.toString(arr));

        String s="Today is a nice day. Today is Thursday. We learn Java.";
        String[] sentences= s.split("\\. ");
        System.out.println(Arrays.toString(sentences));
    }
}
