package day16_ForLoopString;

public class removeDuplicates {
    public static void main(String[] args) {
        String str="aabbaaccdbae";
        String result="";
        for (int i = 0; i < str.length(); i++) {
            String ch=str.charAt(i)+""; // we concanate with string to transform char into string

            if (!result.contains(ch)){
                result+=ch;

            }


        }
        System.out.println(result);
    }
}
