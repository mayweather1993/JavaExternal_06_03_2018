package entities;

import dao.IFly;

public class Batmobile extends Amphibian implements IFly {

    public Batmobile(double price, int year, double speed, int x, int y) {
        super(price, year, speed, x, y);
    }

    @Override
    public double fly() {
        return flyKPD * speed;
    }
}
