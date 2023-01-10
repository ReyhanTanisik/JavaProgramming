package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        //age = 38 years old
        byte age = 38;
        //weight=160 pounds
        short weight = 160; // 160 is within the range of short
        //salary=100000 $
        int salary = 100000;
        long asset = 3_333_333_333L;// L : to specify 'long' because compiler take it automatically as an int
        //tax=0.26
        float tax = 0.26F;
        double PI = 3.14;
        char ch1 = 55;
        char ch2 = 450;
        char ch3 = 8796;
        char ch4 = 54678;
        char gender = 'F';
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);
        System.out.println("ch4 = " + ch4);
        System.out.println("gender = " + gender);
        boolean isMarried = true;
        boolean isEmployeed = false;
        boolean result = 100>300;
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("result = " + result);
        String name = "Reyhan";
        String city = "Gaziantep";
        String country = "Turkey";
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("country = " + country);


    }
}
