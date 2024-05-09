public class Square extends Shape {
    private final String name = "Квадрат";
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return name;
    }


    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
