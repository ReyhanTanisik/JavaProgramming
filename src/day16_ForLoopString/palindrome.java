package day16_ForLoopString;

public class palindrome {
    public static void main(String[] args) {
        String word="level";
        String reversed="";
        int l=word.length();
        for (int i = l-1; i>=0 ; i--) {
             reversed +=word.charAt(i);

        }
        if (reversed.equalsIgnoreCase(word)){
            System.out.println("palindrome");

        }else{
            System.out.println("The word isn't a palindrome");
        }
    }
}
