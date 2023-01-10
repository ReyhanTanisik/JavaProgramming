package day11_SwitchScanner;

public class NumberToWords {
    public static void main(String[] args) {
        int n=1;
      String result=  (n>=1&& n<=10)? (n==1)?"One" :(n==2)?"Two" :(n==3) ? "Three" :(n==4)? "Four" :(n==5)? "Five" : (n==6)?"Six"
                :(n==7)? "Seven" :(n==8)? "Eight" :"Nine" :"Invalid Number";
        System.out.println(result);

    }
}
