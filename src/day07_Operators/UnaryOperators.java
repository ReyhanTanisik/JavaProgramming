package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 =25;
        int num2=-25;
        System.out.println(num1<0);//false
        System.out.println(num2<0);//true
        int a =5;
        ++a; //pre increment , increase the value by 1 immediately
        System.out.println(a);
        --a; // pre decrement ,decrease the value by 1 immediately
        System.out.println(a);
        int b=100;
        System.out.println(++b);
        int c =100;
        System.out.println(c++);//post increment, it will increase by 1 , next step
        System.out.println(c);//101
        int x=200;
        System.out.println(--x);// pre decrement 199.
        int y=200;
        System.out.println(y--); //post decrement ,it has 2steps
        System.out.println(y);
        int z=45;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);
        int q=30;
        System.out.println(--q);
        System.out.println(q--);
        System.out.println(q);
        



    }

}
