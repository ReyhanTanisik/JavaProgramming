package day9_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {
        int n=9;
        String number ="";
        if(n==1){
            number="one";
        }
        else if (n==2){
            number="two";
        }
        else if(n==3){
            number="three";
        }
        else if (n==4){
            number="four";
        }
        else if(n==5){
            number="five";
        }
        else if (n==6){
            number="six";
        }
        else if (n==7){
            number="seven";
        }
        else if (n==8){
            number="eight";
        }
        else{
            number="nine";
        }
        System.out.println(number);
    }
}
