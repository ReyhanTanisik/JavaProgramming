package day17_whileDoWhile;

public class AllEvenNumber {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            if (i%2!=0){ // we will skip all odd numbers
                continue;
            }
            System.out.println(i);

        }
    }
}
