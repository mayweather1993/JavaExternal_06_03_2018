package entities;

import dao.IMove;
import enums.Fuel;
import enums.TransmissionVariety;

public class CCar extends CVehicle implements IMove {

    private final Transmission transmission;

    protected CCar(CarBuilder carBuilder) {
        price = carBuilder.price;
        year = carBuilder.year;
        speed = carBuilder.speed;
        x = carBuilder.x;
        y = carBuilder.y;
        engine = carBuilder.engine;
        transmission = carBuilder.transmission;
    }


    @Override
    public String toString() {
        return "\n" +
                "CCar{" +
                "price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double move() {
        return speed;
    }

    public Transmission getTransmission() {
        return transmission;
    }


    public static class Transmission {
        private final TransmissionVariety transmissionVariety;

        public Transmission(TransmissionVariety transmissionVariety) {
            this.transmissionVariety = transmissionVariety;
        }

        @Override
        public String toString() {
            return "TransmissionVariety{" +
                    "transmission=" + transmissionVariety +
                    '}';
        }
    }

    public static class CarEngine extends Engine {
        private final int horsePower;


        public CarEngine(Fuel FUEL, int horsePower) {
            super(FUEL);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "CarEngine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public static class CarBuilder {
        private double price;
        private int year;
        private double speed;
        private int x;
        private int y;
        private Engine engine;
        private Transmission transmission;

        CarBuilder() {
        }

        public CarBuilder price(double price) {
            this.price = price;
            return this;
        }


        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }


        public CarBuilder speed(double speed) {
            this.speed = speed;
            return this;
        }


        public CarBuilder x(int x) {
            this.x = x;
            return this;
        }


        public CarBuilder y(int y) {
            this.y = y;
            return this;
        }

        public CarBuilder engine(Engine engine) {
            this.engine = engine;
            return this;
        }


        public CarBuilder transmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        public CCar build() {
            return new CCar(this);
        }
    }
}


