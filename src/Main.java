public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();
        Shape rectangle = new Rectangle(4.4,9.2);
        Shape square = new Square(5.45);
        Shape triangle = new Triangle(3.6, 6.2, 9.4);
        Shape circle = new Circle(5.51);
        Shape ellipse = new Ellipse(15.32, 5.3);

        printer.printShape(rectangle);

        printer.printShape(square);

        printer.printShape(triangle);

        printer.printShape(circle);

        printer.printShape(ellipse);


    }
}
