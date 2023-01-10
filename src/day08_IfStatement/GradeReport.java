package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {
        int score=85;
        boolean a= score>=90 && score<=100;
        boolean b= score>=80&& score <=89;
        boolean c= score>=70&& score<=79;
        boolean d= score>=60&& score<=69;
        boolean e= score>=0&& score<=59;
        String message =" ";
        if (a){
           message="Excellent";
        }
       else  if (b){
            message="Great";
        }
       else if (c){
            message="Good";
        }
       else if (d) {
           message="Passed";

        }
        else {
            message=" failed";
        }
        System.out.println("message = " + message);
    }
}
