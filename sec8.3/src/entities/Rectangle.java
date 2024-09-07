package entities;

public class Rectangle {

    public double width;
    public double height;

    public double Area() {
        return width * height;
    }

    public double Perimeter() {
        return (width + height) * 2;
    }

    public double Soma() {
        return width + height;
    }

    public String toString() {
        return "Área: " + Area() + "; Perímetro: " + Perimeter() + "Soma: " + Soma();
    }
}
