package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Josh";
        int age= 32;
        String citizen= "USA";
        boolean isEligible= age>=21 && citizen=="USA";
        if (isEligible){
            System.out.println("Eligible");
        }
         else{
            System.out.println("Not Eligible");
        }
    }
}
