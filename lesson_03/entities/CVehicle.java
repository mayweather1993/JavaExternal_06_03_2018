package entities;


import enums.Fuel;

public abstract class CVehicle {
    double price;
    int year;
    double speed;
    int x;
    int y;
    Engine engine;

    public CVehicle() {
    }

    public CVehicle(double price, int year, double speed, int x, int y, Engine engine) {
        this.price = price;
        this.year = year;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setY(int y) {
        this.y = y;

    }

    @Override
    public abstract String toString();

    public abstract static class Engine {
        private Fuel FUEL;


        public Engine() {
        }

        public Engine(Fuel FUEL) {
            this.FUEL = FUEL;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "FUEL=" + FUEL +
                    '}';
        }
    }
}
