package day25_OverloadingMethods;

import utilities.StringUtilities;

public class test {
    public static void main(String[] args) {
        String str="Java Programming";
        StringUtilities.printEachChar(str);

        String rev= StringUtilities.reverse(str);
        System.out.println(rev);


        String word="Civic";
        boolean result= StringUtilities.isPalindrome(word);
        System.out.println(result);


        String [] names={ "Anna","Java","Python","mom","Cydeo"};

        int count =0;
        for (String each : names){
            if (StringUtilities.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);

        String s2="aaaaaddjjdeefr";
        String s3= StringUtilities.removeDuplicates(s2);
        System.out.println(s3);
    }
}
