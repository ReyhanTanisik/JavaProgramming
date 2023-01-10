package day13_StringClass;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String word="Cydeo";
        char thirdChar= word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

         /* char tenthChar= word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);

          */

        String s1="Batch EU10 is the best batch";
        int totalChar=s1.length();
        System.out.println("totalChar = " + totalChar);
        char lastChar= s1.charAt( s1.length()-1);
        System.out.println("lastChar = " + lastChar);

        String str="wooden spoon";
        str= str.toUpperCase(); // you have to assign it back to modify it
        System.out.println("str = " + str);



    }
}
