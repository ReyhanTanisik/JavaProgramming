package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {
         int num1 =100;
         Integer n1=num1; // autoboxing

        int num2= n1;  //unboxing

        Integer integerValue=100;
        long longValue=integerValue;

        int num3=200;
        Integer n3=num3; // autoboxing


        Integer y=23;
        Integer z=y;

        char c1= '0';
        boolean r= Character.isDigit(c1);
        System.out.println(r);

        char c2='A';
        boolean r1=Character.isLetter(c2);
        System.out.println(r1);

        boolean r2= Character.isLetterOrDigit(c1);
        System.out.println(r2);

        boolean r3= Character.isUpperCase(c2);
        System.out.println(r3);

        boolean r4=Character.isLowerCase(c2);
        System.out.println(r4);


        String ss= "ajjaja5636ışk98";
        int sum=0;
        for( char each : ss.toCharArray()){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(each+"");
            }
        }

        System.out.println(sum);
    }
}
