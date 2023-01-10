package day17_whileDoWhile;

public class FrequencyJava {
    public static void main(String[] args) {
        String s= "Java love Java Java Java is fun";
        int frequency= 0;
        while( s.contains("Java")){
            s=s.replaceFirst("Java","");
            frequency++;
        }
        System.out.println(frequency);
    }
}
