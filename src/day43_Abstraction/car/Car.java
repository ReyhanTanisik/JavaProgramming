package day43_Abstraction.car;

public  abstract class Car {

    private  final String brand, model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if (year<1886){
            throw new RuntimeException(("Invalid year" +year));
        } // program gets terminated here if we have invalid year
        this.year = year;

        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException(" Invalid price" + price);
        }
        this.price = price;
    }



    public  void stop(){
        System.out.println("Press the brake");
    }



    public abstract void start(); // abstract method does not have body
     // it meant to be overridden
    // an abstract method can  only be created in  an abstract class or in an interface
    // an abstract class can only be a parent class


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
