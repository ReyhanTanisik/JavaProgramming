package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        for (int i=65; i<=90; i++){
            System.out.print((char)i+" ");// we are casting to the char, every char has a valur
        }
        System.out.println();
        for (char i='A'; i<='Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (char i='Z' ; i>='A'; i--){
            System.out.print(i+" ");
        }
    }
}
