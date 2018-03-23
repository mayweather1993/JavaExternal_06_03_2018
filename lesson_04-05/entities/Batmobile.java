package entities;

import dao.IFly;
import dao.IMove;
import dao.ISwim;

public class Batmobile extends CCar implements IFly, IMove, ISwim {


    protected Batmobile(CarBuilder carBuilder) {
        super(carBuilder);
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

    public static class BatBuilder extends CarBuilder {
        private BatBuilder() {
        }

        @Override
        public Batmobile build() {
            return new Batmobile(this);
        }
    }
}
