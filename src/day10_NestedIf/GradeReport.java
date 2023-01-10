package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score= 110;
        if (score>=0&& score<=100){
            if (score<=100&&score>=90){
                System.out.println("Excellent");
            }else if (score>=80&& score<=89){
                System.out.println("Great");
            }else if (score>=70&& score<=79){
                System.out.println("Good");
            }else if (score>=60&& score>=69){
                System.out.println("Passed");
            }else{
                System.out.println("Passed");
            }
        }else{
            System.out.println("Invalid Score");
        }



    }
}
