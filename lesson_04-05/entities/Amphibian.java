package entities;

import dao.IMove;
import dao.ISwim;

public class Amphibian extends CCar implements ISwim, IMove {


    protected Amphibian(CarBuilder carBuilder) {
        super(carBuilder);
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


    public static class AmphibiaBuilder extends CarBuilder {

        private AmphibiaBuilder() {
            super();
        }

        public Amphibian build() {
            return new Amphibian(this);
        }
    }
}

