public class Drawer_task2 {
    public static void main(String[] args) throws Throwable {
        Point p1 = new Point(9, 1);
        Point p2 = new Point(3, 19);

        Point pointA = new Point(2, 2);
        Point pointB = new Point(1, 7);

        Line line = new Line(pointA, pointB);

        Triangle triangle = new Triangle(p1, pointB, p2);
        Rectangle rectangle = new Rectangle(p1, p2, pointA, pointB);

        Polygon polygon = new Polygon(new Point(10, 10), new Point(17, 2), new Point(14, 13), new Point(2, 0), new Point(4, -34));

        polygon.putFigure(p1);
        polygon.putFigure(p2);
        polygon.putFigure(line);
        polygon.putFigure(triangle);
        polygon.putFigure(rectangle);

        System.out.println("================");
        System.out.println("Our polygon data");
        System.out.println("================");
        System.out.println(polygon);
    }
}
