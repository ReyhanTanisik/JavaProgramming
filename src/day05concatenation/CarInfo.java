package day05concatenation;

public class CarInfo {
    public static void main(String[] args) {
        int year = 2018;
        String make = "Toyota ",
                model = "Camry",
                        color = "red";
        int miles = 50000,
                price= 19000;
        String carInfo = year + " " +make + model + ", " + miles + " miles," +  color + ", $" + price ;
        System.out.println(carInfo);


    }
}
