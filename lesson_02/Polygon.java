import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polygon {
    private Point[] points;
    private List<Drawable> figures = new ArrayList<>();

    Polygon(Point... p) {
        points = p;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "\n" +
                "points=" + Arrays.toString(points) +
                "\n" +
                "figures=" + figures +
                '}';
    }

    private boolean validate(Point point) {
        Point next;
        Point previous = points[points.length - 1];
        double sum = 0;

        for (int i = 0; i < points.length; i++) {
            next = points[i];
            sum += this.angle(previous, point, next);
        }
        if (((sum - Math.PI) < 0.0001) && ((sum - Math.PI) > -0.0001))
            return true;
        else return false;
    }

    //just some logic
    private double angle(Point a, Point b, Point c) {
        return Math.PI / 5;
    }

    public void putFigure(Drawable drawable) throws Throwable {
        if (this.isValid(drawable)) {
            figures.add(drawable);
        } else {
            throw new NotValidFigureException("Not valid!");
        }
    }

    private boolean isValid(Drawable drawable) {
        if (drawable instanceof Point)
            return this.validate((Point) drawable);
        else if (drawable instanceof Line)
            return this.validate(((Line) drawable).getStart())
                    && this.validate(((Line) drawable).getEnd());
        else if (drawable instanceof Triangle)
            return this.validate(((Triangle) drawable).getA())
                    && this.validate(((Triangle) drawable).getB())
                    && this.validate(((Triangle) drawable).getC());
        else if (drawable instanceof Rectangle)
            return this.validate(((Rectangle) drawable).getA())
                    && this.validate(((Rectangle) drawable).getB())
                    && this.validate(((Rectangle) drawable).getC())
                    && this.validate(((Rectangle) drawable).getD());
        else return false;
    }
}
