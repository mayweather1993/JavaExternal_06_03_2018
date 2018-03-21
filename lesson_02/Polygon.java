import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Polygon {
    private List<Point> figures = new ArrayList<>();
    private Point[] points;

    public Polygon(Point... points) {
        this.figures = Arrays.asList(points);
    }

    public Polygon() {

    }

    public void generateFigure(Point... points) {
        figures = Arrays.asList(points);
    }

    public List<Point> getFigures() {
        return figures;
    }

    public void setFigures(List<Point> figures) {
        this.figures = figures;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public void putFigure(Drawable drawable) throws NotValidFigureException {
        if (isValid(drawable)) {
            figures.add((Point) drawable);
        } else {
            throw new NotValidFigureException("Not a valid figure , sorry!");
        }
    }

    public boolean isValid(Drawable drawable) {
        if (drawable instanceof Point) {
            return validPoint((Point) drawable);
        } else if (drawable instanceof Line) {
            return validPoint(((Line) drawable).getEnd())
                    && validPoint(((Line) drawable).getStart());
        } else if (drawable instanceof Triangle) {
            return validPoint(((Triangle) drawable).getA())
                    && validPoint(((Triangle) drawable).getB())
                    && validPoint(((Triangle) drawable).getC());
        } else if (drawable instanceof Rectangle) {
            return validPoint(((Rectangle) drawable).getA())
                    && validPoint(((Rectangle) drawable).getB())
                    && validPoint(((Rectangle) drawable).getC())
                    && validPoint(((Rectangle) drawable).getD());
        } else return false;
    }

    public boolean validPoint(Point point) {
        Point previous = points[points.length - 1];
        Point next;
        double sum = 0;
        for (int i = 0; i < points.length; i++) {
            next = points[i];
            sum += angle(previous, point, next);
        }
        return (sum - Math.PI < 0.0001) && ((sum - Math.PI > -0.0001));
    }

    public double angle(Point previous, Point current, Point next) {
        return Math.PI / 5;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "figures=" + figures +
                '}';
    }
}
