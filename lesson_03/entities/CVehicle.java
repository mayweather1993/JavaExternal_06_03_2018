package entities;


public abstract class CVehicle {
    protected double price;
    protected int year;
    protected double speed;
    protected int x;
    protected int y;

    public CVehicle() {
    }

    public CVehicle(double price, int year, double speed, int x, int y) {
        this.price = price;
        this.year = year;
        this.speed = speed;
        this.x = x;
        this.y = y;
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

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public abstract String toString();
}
