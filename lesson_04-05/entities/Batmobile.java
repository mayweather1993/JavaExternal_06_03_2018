package entities;

import dao.IFly;
import dao.IMove;
import dao.ISwim;

public class Batmobile extends CCar implements IFly, IMove, ISwim {

    public Batmobile(double price, int year, double speed, int x, int y) {
        super(price, year, speed, x, y);
    }

    @Override
    public double fly() {
        return flyKPD * speed;
    }


    @Override
    public double move() {
        return speed;
    }

    @Override
    public double swim() {
        return swimmingKPD * speed;
    }

    @Override
    public String toString() {
        return "\n" +
                "Batmobile{" +
                "price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
