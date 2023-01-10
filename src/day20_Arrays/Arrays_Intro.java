package day20_Arrays;

import java.util.Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        // create a variable that contains 5 names
       String[] myGroup = new String[5];
       myGroup[0]="Ali";
       myGroup[1]="Nur";
       myGroup[2]="Erdem";
       myGroup[3]="Oguz";
       myGroup[4]="İzel";
        System.out.println(Arrays.toString(myGroup));


        String[] days= {"Momday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

        int number=5;
        if (number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
    }
}
