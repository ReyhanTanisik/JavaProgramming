package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scan.nextInt();

        System.out.println("Enter your gender:");
        String gender= scan.next();

        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName=scan.nextLine();

        System.out.println("Enter your phone number:");
        long phoneNumber=scan.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode= scan.nextInt();

        scan.nextLine();

        System.out.println(" Enter your school name:");
        String schoolName=scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName= scan.nextLine();

        System.out.println("Enter your state name:");
        String stateName= scan.next();

        System.out.println("Enter your building number");
        int buildingNumber=scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name:");
        String streetName =scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("adress: \n"  +buildingNumber +", " +streetName + "\n" +cityName +"," +stateName);
        System.out.println("schoolName = " + schoolName);

        scan.close();



    }
}
