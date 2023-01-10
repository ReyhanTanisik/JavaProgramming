package day08_IfStatement;

public class NameOfDays {
    public static void main(String[] args) {
        int number = 5;
        boolean invalid = number >7;
        boolean monday = number==1;
        boolean tuesday = number==2;
        boolean wednesday= number==3;
        boolean thursday = number==4;
        boolean friday=number==5;
        boolean saturday=number==6;
        boolean sunday=number==7;
        if (monday){
            System.out.println("Monday");
        }
        else if (tuesday){
            System.out.println("Tuesday");
        }
        else if (wednesday){
            System.out.println("Wednesday");
        }
        else if (thursday){
            System.out.println("Thursday");
        }
        else if (friday){
            System.out.println("Friday");
        }
        else if (saturday){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Sunday");
        }
    }
}
