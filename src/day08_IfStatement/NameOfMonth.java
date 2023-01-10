package day08_IfStatement;

public class NameOfMonth {
    public static void main(String[] args) {


    int number = 10;
    boolean invalid = number>12;
    boolean january= number==1 ;
    boolean february= number==2;
    boolean march= number==3;
    boolean april= number==4;
    boolean may =number==5;
    boolean june= number==6;
    boolean july=number==7;
    boolean august=number==8;
    boolean september= number==9;
    boolean october =number==10;
    boolean november = number==11;
    boolean december = number==12;
    String month="";
    if (january){
        month="January";
    }
   else if (february){
        month="February";
    }
   else if (march){
      month="March";

    }
   else if (april){
        month="April";
    }
   else if (may){
        month="May";
    }
   else if (june){
       month="June";

    }
   else if (july){
       month="July";
    }
  else  if (august){
       month="August";
    }
   else if (september) {
        month = "September";
    }
   else if (october){
     month="October";
    }
   else if (november){
        month="November";
    }
   else if (december){
       month="December";
    }
    else{
        System.out.println("The number is invalid");
    }
        System.out.println("month = " + month);



             }

}
