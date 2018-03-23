package entities;

import dao.IMove;
import dao.ISwim;

public class Amphibian extends CCar implements ISwim, IMove {
    public Amphibian(double price, int year, double speed, int x, int y) {
        super(price, year, speed, x, y);
    }

    @Override
    public double swim() {
        return swimmingKPD * speed;
    }

    @Override
    public double move() {
        return speed;
    }

    @Override
    public String toString() {
        return "\n" +
                "Amphibian{" +
                "price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
