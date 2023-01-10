package day17_whileDoWhile;

public class FrequencyofChar {
    public static void main(String[] args) {
        String str="AACFTRWWASSSDAA";
        char a='A';
        int frequency=0;
        for (int i = 0; i <str.length() ; i++) {
            char b=str.charAt(i);
            if ( a ==  b){
                frequency +=1;

            }
        }
        System.out.println(frequency);
    }
}
