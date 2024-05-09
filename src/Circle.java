public class Circle extends Shape {
    private final String name = "Коло";
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
