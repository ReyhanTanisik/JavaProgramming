package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your full name:");
        String name= input.nextLine();

        System.out.println("Enter your building number :");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your street name:");
        String street= input.nextLine();

        System.out.println("Enter your city name:");
        String city=input.nextLine();

        System.out.println("Enter your country name:");
        String country= input.next();

        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("country = " + country);
        input.close();
    }
}
