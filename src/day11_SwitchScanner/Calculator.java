package day11_SwitchScanner;

public class Calculator {
    public static void main(String[] args) {
        double n1=29;
        double n2=32;
        char ch= '+';
        boolean valid = (ch=='+' )|| (ch=='-' )|| (ch=='*')||( ch=='/');
        if (valid){
            switch(ch){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;

                case '*':
                    System.out.println(n1*n2);
                    break;
                case '/':
                    System.out.println(n1/n2);
                    break;
            }
        } else{
            System.out.println("Invalid Operator");
        }
    }
}
