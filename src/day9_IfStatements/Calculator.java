package day9_IfStatements;

public class Calculator {
    public static void main(String[] args) {
        double n1=10;
        double n2=20;
        char mathOperator='*';


        if (mathOperator=='+') {
            System.out.println(n1 + n2);
        } else if(mathOperator=='-'){
            System.out.println(n1-n2);
        }
        else if (mathOperator=='*'){
            System.out.println(n1*n2);
        }
        else if (mathOperator=='/'){
            System.out.println(n1/n2);
        }
        else{
            System.out.println("İnvalid Operator");
        }
    }
}
