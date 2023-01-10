package day23_CustomMethodsVoid;

public class MethodPractice2 {
    public static void main(String[] args) {
        helloWorld5times();
        helloCydeo5times();
        evenNumbers();

    }

    public static void helloWorld5times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World!");

        }

    }

    public static void helloCydeo5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }

    }

    public static void evenNumbers(){
        for (int i = 1; i <=10 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
    }

}
