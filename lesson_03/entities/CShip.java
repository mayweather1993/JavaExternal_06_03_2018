package entities;

import dao.ISwim;
import enums.Fuel;

public class CShip extends CVehicle implements ISwim {
    private int capacity;
    private String portOfRegistration;


    public int getCapacity() {
        return capacity;
    }


    public String getPortOfRegistration() {
        return portOfRegistration;
    }

    private CShip(ShipBuilder builder) {
        price = builder.price;
        year = builder.year;
        speed = builder.speed;
        x = builder.x;
        y = builder.y;
        engine = builder.engine;
        capacity = builder.capacity;
        portOfRegistration = builder.portOfRegistration;
    }


    @Override
    public String toString() {
        return "\n" +
                "CShip{" +
                "capacity=" + capacity +
                ", portOfRegistration='" + portOfRegistration + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", speed=" + speed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double swim() {
        return speed * swimmingKPD;
    }

    public static class ShipEngine extends Engine {
        //суммарный рабочий обьем(в литрах)
        private final int TOTAL_WORKING_VOLUME;

        public ShipEngine(Fuel FUEL, int TOTAL_WORKING_VOLUME) {
            super(FUEL);
            this.TOTAL_WORKING_VOLUME = TOTAL_WORKING_VOLUME;
        }

        @Override
        public String toString() {
            return "ShipEngine{" +
                    "TOTAL_WORKING_VOLUME=" + TOTAL_WORKING_VOLUME +
                    '}';

        }
    }

    public static class ShipBuilder {
        private double price;
        private int year;
        private double speed;
        private int x;
        private int y;
        private Engine engine;
        private int capacity;
        private String portOfRegistration;

        private ShipBuilder() {
        }


        public ShipBuilder price(double price) {
            this.price = price;
            return this;
        }


        public ShipBuilder year(int year) {
            this.year = year;
            return this;
        }


        public ShipBuilder speed(double speed) {
            this.speed = speed;
            return this;
        }


        public ShipBuilder x(int x) {
            this.x = x;
            return this;
        }


        public ShipBuilder y(int y) {
            this.y = y;
            return this;
        }

        public ShipBuilder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public ShipBuilder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public ShipBuilder portOfRegistration(String portOfRegistration) {
            this.portOfRegistration = portOfRegistration;
            return this;
        }

        public CShip build() {
            return new CShip(this);
        }
    }
}
