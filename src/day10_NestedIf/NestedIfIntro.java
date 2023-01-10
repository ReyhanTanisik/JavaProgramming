package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
     int score=95;
     if (score>=0&& score<=100) {
         if (score >= 60) {
             System.out.println("Passed");
         } else {
             System.out.println("Failed");
         }
     }else{
         System.out.println("Invalid score");
     }
     int age =25;
     boolean hasId=true;
     if (hasId) {
         if (age >= 21) {
             System.out.println("Eligible to buy alcohol.");
         } else {
             System.out.println("Not eligible to buy alcohol.");
         }
     }else{
         System.out.println("You must have an ID to buy alcohol.");
     }

     int number=7;
     if (number>=1&& number<=7){

// 7 options

    }else {
         //if the number isn't valid
     }

     }
}
