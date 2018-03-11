package pl.coderstrust.figures;

public class Rectangle implements Figure {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);

        System.out.println(rectangle.calculateArea());
    }
}
