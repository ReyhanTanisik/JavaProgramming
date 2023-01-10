package day40_FinalKeyword;

public class FinalVariable {
   final String birthday;

   final static String name;

   static{
       name="Batch 25";
   }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }


    public static void main(String[] args) {
        final double pi=3.14; // no other value can replace it

        // pi=4.14

        final String name;
        name="Java";

       // name=" wooden spoon"


        FinalVariable obj= new FinalVariable("May/01");
        System.out.println(obj.birthday);

        //obj.birthday=June/01 we cannot assign it second time


        System.out.println(FinalVariable.name);



    }
}
