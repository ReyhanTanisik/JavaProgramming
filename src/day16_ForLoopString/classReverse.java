package day16_ForLoopString;

public class classReverse {
    public static void main(String[] args) {
        String str="Wooden spoon";
        String result="";  // will contain the reverse version
        int l=str.length();
        for (int i = l-1; i >=0 ; i--) {
            result+=str.charAt(i);


        }
        System.out.println(result);

        

    }
}
