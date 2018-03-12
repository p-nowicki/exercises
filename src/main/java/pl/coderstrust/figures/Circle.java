package pl.coderstrust.figures;

public class Circle implements Figure {

    public final double PI_NUMBER = 3.14;
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI_NUMBER * (radius ^ 2);
    }

}