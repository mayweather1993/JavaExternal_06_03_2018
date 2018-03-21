import java.util.ArrayList;
import java.util.List;

public class Drawer_task1 {
    public static void main(String[] args) {
        List<Drawable> figures = new ArrayList<>();
        figures.add(new Point(11, 18));
        figures.add(new Point(3, 10));
        figures.add(new Line(new Point(4, 5), new Point(9, 3)));
        figures.add(new Triangle(new Point(7, 8), new Point(5, 6), new Point(9, 15)));
        figures.add(new Rectangle(new Point(2, 3), new Point(2, 6), new Point(6, 6), new Point(6, 3)));
        System.out.println("========");
        System.out.println("Print 2 points");
        System.out.println("========");
        System.out.println(figures.get(0));
        System.out.println(figures.get(1));
        System.out.println("\n");

        System.out.println("==========");
        System.out.println("Print line");
        System.out.println("==========");
        System.out.println(figures.get(2));
        System.out.println("\n");

        System.out.println("==============");
        System.out.println("Print triangle");
        System.out.println("==============");
        System.out.println(figures.get(3));
        System.out.println("\n");


        System.out.println("===============");
        System.out.println("Print rectangle");
        System.out.println("===============");
        System.out.println(figures.get(4));
        System.out.println("\n");
    }
}
