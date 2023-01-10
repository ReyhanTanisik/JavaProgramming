package day24_customMethods_return;

public class ReturnMethod_Intro {
    public static void main(String[] args) {
        String str= "Java";
         String result=reverse("Java");
        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome.");
        }else{
            System.out.println(str + " isn't palindrome.");
        }

    }


    public static String reverse ( String str){

         String  reverse="";
         for( int  i= str.length()-1; i>=0 ; i--){
             reverse += str.charAt(i);
         }
         return reverse;


    }


}
