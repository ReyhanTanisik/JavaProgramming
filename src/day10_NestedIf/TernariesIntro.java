package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int a=100;
        if (a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        String result1=(a%2==0)?"Even": "Odd";
        System.out.println(result1);

        int age =21;
        if (age>=21){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        String result2=(age>=21)?"Eligible to vote.": "Not eligible to vote";
        System.out.println(result2);

        int n =34;
       String result3= (n>0)?"Positive":(n<0)?"Negative":"Zero"; // we use ternaries when the output is STRİNG and just one output!
        System.out.println(result3);

    }
}
