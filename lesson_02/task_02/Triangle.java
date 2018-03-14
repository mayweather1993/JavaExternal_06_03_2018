package task_02;

public class Triangle extends Polygon {

    private final double sideA;
    private final double sideB;
    private final double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return ;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
