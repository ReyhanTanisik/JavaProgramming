package day08_IfStatement;

public class singleIfStatement_Intro {
    public static void main(String[] args) {
        int number =300;
        boolean evenNumber = number%2==0;
        if (evenNumber){

            System.out.println(number + " is even number.");
        }
        if(!evenNumber){
            System.out.println(number +" is odd number.");
        }


         System.out.println("-------------------------------------");

        int n=200;
        boolean isPositive = n>0;
        boolean isNegative = n<0;
        boolean isZero = n==0;
        if(isPositive){
            System.out.println(n +" is Positive.");
        }
        if(isNegative){
            System.out.println(n + " is Negative.");
        }
        if(isZero){
            System.out.println(n+ " is Zero.");
        }

    }
}
