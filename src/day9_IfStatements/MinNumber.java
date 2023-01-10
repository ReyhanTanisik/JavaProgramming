package day9_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1= 100;
        int n2=100;
        boolean case1 = n1>n2;
        boolean case2 = n1<n2;
        boolean case3= n1==n2;
        if(case1){
            System.out.println(n2 + "  is minimum number.");
        }
        if (case2){
            System.out.println(n1 + " is minimum number.");
        }
        if (case3){
            System.out.println(" The numbers are equal to each other.");
        }

    }
}
