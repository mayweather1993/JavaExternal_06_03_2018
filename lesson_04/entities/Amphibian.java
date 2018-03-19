package entities;

import dao.ISwim;

public class Amphibian extends CCar implements ISwim {
    public Amphibian(double price, int year, double speed, int x, int y) {
        super(price, year, speed, x, y);
    }

    @Override
    public void swim() {

    }
}
