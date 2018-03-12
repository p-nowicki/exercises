package pl.coderstrust.figures;

public class Circle implements Figure {

    public final double PI_NUMBER = 3.14;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI_NUMBER * (radius * radius);
    }

}