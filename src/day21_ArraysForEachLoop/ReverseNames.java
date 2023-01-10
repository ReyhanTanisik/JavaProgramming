package day21_ArraysForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names= { "Ali Ayhan", "Reyhan Tanişik","Kalbinur Yula Düzkalem","Mahmut Muhtar"};

        for( String each: names){
            String reversed="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed += each.charAt(i);
                
            }
            System.out.println(reversed);
        }
    }
}
