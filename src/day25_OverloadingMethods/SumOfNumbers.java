package day25_OverloadingMethods;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum=sumOfNumbers(5,6); // I can treat it as a value, I can assign it to a variable
        System.out.println("sum = " + sum);

        int sum1= sumOfNumbers(3,6,9);
        System.out.println("sum1 = " + sum1);

        int sum2= sumOfNumbers(4,8,9,23);
        System.out.println("sum2 = " + sum2);


    }
    public static int sumOfNumbers( int num1, int num2){
        return num1+ num2;
    }

    public static int sumOfNumbers ( int num1, int num2 , int num3){
        return num1+num2+num3;
    }

    public static int sumOfNumbers( int num1 , int num2 , int num3 , int num4){
        return num1+num2+num3+num4;
    }
}
