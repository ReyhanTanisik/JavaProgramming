package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="123";
        int num=Integer.parseInt(str); // it will return me int value
        System.out.println(num+1);
        System.out.println(str+1);


        String str2= "123.5";
        double num1= Double.parseDouble(str2);
        System.out.println(num1+1);


        int max =Integer.MAX_VALUE;  // a variable in the wrapper class
        int min = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);

        long min1= Long.MIN_VALUE;
        long max2=Long.MAX_VALUE;
        System.out.println(min1);
        System.out.println(max2);

        String s1="true";
        boolean b1= Boolean.parseBoolean(s1);
        System.out.println(b1);


        String st="123";
        Integer a= Integer.valueOf(st); // it will return me wrapper class
        int x= Integer.valueOf(st);

        System.out.println(a);
        System.out.println(x);

        String stt="1.4";
        Double y= Double.valueOf(stt);
        System.out.println(y);

    }
}
