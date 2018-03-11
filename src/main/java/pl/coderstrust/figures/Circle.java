package pl.coderstrust.figures;

public class Circle implements Figure {

    private final double PI_NUMBER = 3.14;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    @Override
    public double calculateArea() {
        return PI_NUMBER * (radius ^ 2);
    }

}
