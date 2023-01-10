package day9_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c =20;
        boolean case1= (a<b && b<c )|| (a>c&& a<b);// a minimum number and c maximal or c is minimum number and a is maximal
        boolean case2 =(a>b && a<c )|| (b>c && b<a);// b is minimum and c is maximal or c is minimum and b is maximal
        boolean case3= (c>a && c<b )|| (c>b && c<a);
        if (case1){
            System.out.println(b + " is median number.");
        }
        if (case2){
            System.out.println(a + " is median number.");
        }
        if (case3){

            System.out.println(c + " is median number.");
        }
    }
}
