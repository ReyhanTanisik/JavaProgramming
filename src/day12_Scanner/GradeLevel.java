package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        int level=5;
        if (level>=1 && level <=18){
            switch(level){
                case 1: case 2 : case 3: case 4: case 5:
                    System.out.println("Elementary school");
                    break;
                case 6: case 7: case 8:
                    System.out.println("Middle school");
                    break;
                case 9: case 10: case 11: case 12:
                    System.out.println("High school");
                    break;
                case 13: case 14: case 15: case 16:
                    System.out.println("High school");
                    break;
                default:
                    System.out.println("Grad School");

            }
        } else{
            System.out.println("Invalid level");
        }

    }
}
