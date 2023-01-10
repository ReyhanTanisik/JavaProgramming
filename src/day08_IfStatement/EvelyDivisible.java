package day08_IfStatement;

public class EvelyDivisible {
    public static void main(String[] args) {
        int number =65;
        boolean isDivisibleByTwo = 65%2==0;
        boolean isDivisibleByThree = 65%3==0;
        boolean isDivisibleByFive = 65%5==0;
        System.out.println(number+ " is divisible by 2 : "+isDivisibleByTwo);
        System.out.println(number+" is divisible by 3 :" +isDivisibleByThree);
        System.out.println(number+ " is divisible by 5 :" +isDivisibleByFive);
    }
}
