package day23_CustomMethodsVoid;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        OddOrEven(2);// method demand additional information
        age(2001);
        printNumbers(10,50);
    }

    public static void OddOrEven(int num){
        if (num%2==0){
            System.out.println(num+" is even number.");
        }else{
            System.out.println(num+" is odd number.");
        }
    }
    public static void age(int birthYear){
        int age= 2022- birthYear;
        System.out.println("Your age is " +age);
    }
    public static void printNumbers(int x,int y){
        for (int i = x; i <=y ; i++) {
            System.out.println(i);

        }
    }

}
