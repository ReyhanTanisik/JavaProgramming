package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age= 19;
        String citizen = "USA";
        boolean isEligible = age >=18 && citizen =="USA";
        System.out.println(name + " is eligible to vote " +isEligible);


        String name4 = "James";
        String countryOfBirth ="UK";
        boolean marriedToUsCitizen= false;
        boolean isEligible4 = countryOfBirth=="USA" || marriedToUsCitizen==true;
        System.out.println(name4 + " is eligible to apply for US citizenship: " +isEligible4);

        String name5= "Anna";
        double gpa = 3.5;
        int familyIncome =50000;
        boolean isEligible5 = gpa >=3.5|| familyIncome<=60000;
        System.out.println(name5 + " is eligible for scholarship :" +isEligible5);


    }
}
