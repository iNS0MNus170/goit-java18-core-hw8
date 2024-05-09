import java.text.DecimalFormat;

public class ShapePrinter {
    private final DecimalFormat decimalFormat;

    public ShapePrinter() {
        decimalFormat = new DecimalFormat("#.##");
    }

    public void printShape(Shape shape) {
        System.out.println("Назва фігури - " + shape.getShapeName() +
                ", площа цієї фігури - " +
                decimalFormat.format(shape.calculateArea()) +
                " , периметер цієї фігури - " +
                decimalFormat.format(shape.calculatePerimeter()));
    }
}