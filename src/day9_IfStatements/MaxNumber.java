package day9_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        int a =23;
        int b=11;
        int c=7;
        boolean amax= a>b&&a>c;
        boolean bmax= b>a&&b>c;
        boolean cmax =c>a&&c>b;
        if (amax){
            System.out.println(a+" is maximum.");
        }
        else if(bmax){
            System.out.println(b+ " is maximum.");
        }
        else{
            System.out.println(c+ " is maximum.");
        }
    }
}
