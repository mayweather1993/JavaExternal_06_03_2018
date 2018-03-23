package entities;

import dao.Builder;
import dao.IFly;
import enums.AirDistance;
import enums.Fuel;

public class CPlane extends CVehicle implements IFly {

    private final int capacity;
    private final double height;


    private CPlane(AirBuilder airBuilder) {
        price = airBuilder.price;
        year = airBuilder.year;
        speed = airBuilder.speed;
        x = airBuilder.x;
        y = airBuilder.y;
        engine = airBuilder.engine;
        capacity = airBuilder.capacity;
        height = airBuilder.height;
    }


    @Override
    public String toString() {
        return "\n" +
                "CPlane{" +
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

    public double getHeight() {
        return height;
    }


    @Override
    public double fly() {
        return speed * flyKPD;
    }


    public static class AirEngine extends Engine {

        private AirDistance distance;


        public AirEngine(Fuel FUEL, AirDistance distance) {
            super(FUEL);
            this.distance = distance;
        }
    }

    public static class AirBuilder implements Builder{
        private double price;
        private int year;
        private double speed;
        private int x;
        private int y;
        private Engine engine;
        private int capacity;
        private double height;

        public AirBuilder() {
        }

        public AirBuilder price(double price) {
            this.price = price;
            return this;
        }


        public AirBuilder year(int year) {
            this.year = year;
            return this;
        }


        public AirBuilder speed(double speed) {
            this.speed = speed;
            return this;
        }


        public AirBuilder x(int x) {
            this.x = x;
            return this;
        }


        public AirBuilder y(int y) {
            this.y = y;
            return this;
        }

        public AirBuilder engine(Engine engine) {
            this.engine = engine;
            return this;
        }


        public AirBuilder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }


        public AirBuilder height(double height) {
            this.height = height;
            return this;
        }

        public CPlane build() {
            return new CPlane(this);
        }
    }
}

