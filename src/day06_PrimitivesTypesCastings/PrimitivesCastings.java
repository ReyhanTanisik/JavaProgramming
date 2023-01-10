package day06_PrimitivesTypesCastings;

public class PrimitivesCastings {
    public static void main(String[] args) {
        byte a =100;
        short b= a;
        int c =b;
        //implicit casting
        long d =c;
        int x = 55;
        short y = (short)x;
        long j = 10000000;
        short k = (short)j;
        double l = 2.5;
        float m = (float)l;
        double n = 10.8;
        int s = (int)n;
        System.out.println( n + ":" +s);
        double d1 = 20.5;
        short s1= (short) d1;
        float f1 = 30.5F;
        long l1 = (long) f1;

    }
}
