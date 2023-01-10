package day9_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int n =100;
        if (n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");

        }else{ // you don't have to make a condition here
            System.out.println("Zero");
        }
    }
}
