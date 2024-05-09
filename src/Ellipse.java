public class Ellipse extends Shape {
    private final String name = "Еліпс";
    private final double majorAxis;
    private final double minorAxis;

    @Override
    public String getShapeName() {
        return name;
    }

    public Ellipse(double majorAxis, double minorAxis) {
        if (majorAxis > minorAxis) {
            this.minorAxis = minorAxis;
            this.majorAxis = majorAxis;
        } else throw new IllegalArgumentException("Основна піввісь повинна бути більшою, ніж побічна піввісь.");
    }


    @Override
    public double calculateArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }
}
