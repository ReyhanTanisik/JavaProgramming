package utilities;

import java.util.Arrays;

public class StringUtilities {


    // print each character of a giving string
    public static void printEachChar (String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    public static String reverse( String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+= str.charAt(i);

        }
        return result;
    }


    // check if the given string is palindrome
    public static boolean isPalindrome (String str){
      return  reverse(str).equalsIgnoreCase(str);

    }

    public static boolean anagram( String str1, String str2){
        char [] char1 = str1.toCharArray();
        char [] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return  Arrays.equals(char1,char2);
    }

    // remove the duplicates from the string

    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
            if(! result.contains(""+each)){
                result += each ;
            }

        }
        return result;
    }


}
