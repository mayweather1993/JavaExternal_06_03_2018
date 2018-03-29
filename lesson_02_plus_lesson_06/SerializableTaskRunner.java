import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class SerializableTaskRunner {
    public static void main(String[] args) throws Throwable {

        Point p1 = new Point(9, 1);
        Point p2 = new Point(3, 19);

        Point pointA = new Point(2, 2);
        Point pointB = new Point(1, 7);

        Line line = new Line(pointA, pointB);

        Triangle triangle = new Triangle(p1, pointB, p2);
        Rectangle rectangle = new Rectangle(p1, p2, pointA, pointB);

        Polygon poli2 = new Polygon(new Point(10, 10), new Point(17, 2), new Point(14, 13), new Point(2, 0), new Point(4, -34));

        poli2.putFigure(p1);
        poli2.putFigure(p2);
        poli2.putFigure(line);
        poli2.putFigure(triangle);
        poli2.putFigure(rectangle);

        List<Drawable> drawables = Arrays.asList(triangle, pointA, p1);
        String fileName = "drawing.txt";

        for (Drawable drawable : drawables) {
            System.out.println("Before serialize: " + drawable.toString());
            SerializableUtils.serializeFigures(fileName, drawable);
            Serializable triangleDesiarilized = SerializableUtils.deserializeFigures(fileName, Serializable.class);
            System.out.println("After desirialize: " + triangleDesiarilized);
        }

    }
}
