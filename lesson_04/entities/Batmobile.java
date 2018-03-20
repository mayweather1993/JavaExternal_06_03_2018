package entities;

import dao.IFly;
import dao.IMove;
import dao.ISwim;

public class Batmobile extends Amphibian implements IFly, IMove, ISwim {

    public Batmobile(double price, int year, double speed, int x, int y) {
        super(price, year, speed, x, y);
    }

    @Override
    public double fly() {
        return flyKPD * speed;
    }

    @Override
    public double swim() {
        return super.swim();
    }

    @Override
    public double move() {
        return super.move();
    }
}
