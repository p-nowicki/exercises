package pl.coderstrust.figures;

public class Trapezoid implements Figure {

    private double parallelSideA;
    private double parallelSideB;
    private double height;

    public Trapezoid(double parallelSideA, double parallelSideB, double height) {
        this.parallelSideA = parallelSideA;
        this.parallelSideB = parallelSideB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((parallelSideA + parallelSideB) * height) / 2;
    }
}
