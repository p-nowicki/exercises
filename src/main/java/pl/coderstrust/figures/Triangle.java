package pl.coderstrust.figures;

public class Triangle implements Figure {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base / 2 * height;
    }
}
