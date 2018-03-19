package entities;

public class CCar extends CVehicle {

    public CCar(double price, int year, double speed, int x, int y) {
        super(price, year, speed, x, y);
    }


    @Override
    public String toString() {
        return "CCar{" +
                "price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
