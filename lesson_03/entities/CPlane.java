package entities;

public class CPlane extends CVehicle {

    private int capacity;
    private double height;


    public CPlane(double price, int year, double speed, int x, int y, int capacity, double height) {
        super(price, year, speed, x, y);
        this.capacity = capacity;
        this.height = height;
    }

    @Override
    public String toString() {
        return "CPlane{" +
                "capacity=" + capacity +
                ", height=" + height +
                ", price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
