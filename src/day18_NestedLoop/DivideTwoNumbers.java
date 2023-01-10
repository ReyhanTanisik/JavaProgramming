package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a=100;
        int b=10;
        int div=0;
        while(a>=b){
            a -=b;
            div++;

        }
        System.out.println(div);
        System.out.println("remainder is " +a);
    }
}
