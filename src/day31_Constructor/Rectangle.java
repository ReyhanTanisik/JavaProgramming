package day31_Constructor;

public class Rectangle {

    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter(){
        return 2*( width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
