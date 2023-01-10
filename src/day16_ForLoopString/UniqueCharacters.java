package day16_ForLoopString;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aassdfretyhggg";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){ //this means that the character is unique
                result+=str.charAt(i);
            }

        }
        System.out.println(result);
    }
}
