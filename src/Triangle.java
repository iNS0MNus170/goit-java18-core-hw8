public class Triangle extends Shape {
    private final String name = "Трикутник";
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    private double calculateSemiPerimeter() {
        return (side1 + side2 + side3) / 2;
    }

    @Override
    public double calculateArea() {
        double semiP = calculateSemiPerimeter();
        double area = semiP * (semiP - side1) * (semiP - side2) * (semiP - side3);
        return Math.sqrt(area);
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
