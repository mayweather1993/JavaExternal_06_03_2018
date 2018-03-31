import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class SerializableTaskRunner {
    public static void main(String[] args) throws Throwable {

        Point p1 = new Point(9, 1);
        Point p2 = new Point(3, 19);

        Point pointA = new Point(2, 2);
        Point pointB = new Point(1, 7);

        Drawable line = new Line(pointA, pointB);

        Drawable triangle = new Triangle(p1, pointB, p2);
        Drawable rectangle = new Rectangle(p1, p2, pointA, pointB);

        Polygon polygon = new Polygon(new Point(10, 10), new Point(17, 2), new Point(14, 13), new Point(2, 0), new Point(4, -34));

        polygon.putFigure(p1);
        polygon.putFigure(p2);
        polygon.putFigure(line);
        polygon.putFigure(triangle);
        polygon.putFigure(rectangle);

        List<Drawable> drawables = Arrays.asList(triangle, pointA, p1);
        String fileName = "drawing.txt";

        for (Drawable drawable : drawables) {
            System.out.println("Before serialize: " + drawable.toString());
            SerializableUtils.serializeFigures(fileName, drawable);
            Serializable triangleDeserialize = SerializableUtils.deserializeFigures(fileName, Serializable.class);
            System.out.println("After deserialize: " + triangleDeserialize + "\n");

        }
        SerializableUtils.serializeFigures("triangle.txt", triangle);
        SerializableUtils.serializeFigures("rectangle.txt", rectangle);
        SerializableUtils.serializeFigures("line.txt", line);
        System.out.println("Deserialized triangle :");
        System.out.println(SerializableUtils.deserializeFigures("triangle.txt", Serializable.class));
        System.out.println("\n");
        System.out.println("Deserialized rectangle :");
        System.out.println(SerializableUtils.deserializeFigures("rectangle.txt", Serializable.class));
        System.out.println("\n");
        System.out.println("Deserialized line :");
        System.out.println(SerializableUtils.deserializeFigures("line.txt", Serializable.class));
    }
}
