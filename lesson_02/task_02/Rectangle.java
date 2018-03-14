package task_02;

public class Rectangle extends Polygon {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2.0 * (width + height);
    }

    @Override
    public double calculatePerimeter() {
        return width * height;
    }
}
