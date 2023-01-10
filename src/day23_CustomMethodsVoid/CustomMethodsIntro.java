package day23_CustomMethodsVoid;

public class CustomMethodsIntro {
    public static void greeting(){
        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
    } // all methods should be independent.it should be outside  the main method

    public static void main(String[] args) { // in the main method the code is runnable
        System.out.println("Test started");
        greeting();
        System.out.println("Test completed");

    } // minimize it to have a clear code
}
