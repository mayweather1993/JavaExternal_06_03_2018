public class Drawer_task2 {
    public static void main(String[] args) {
        Polygon polygon1 = new Polygon(new Point(7, 2));
        System.out.println("Point " + polygon1);
        Polygon polygon2 = new Polygon();
        polygon2.generateFigure(new Point(10, 2), new Point(10, 15), new Point(15, 15), new Point(15, 10));
        System.out.println("Square " + polygon2);
    }
}
