package entities;

public class CShip extends CVehicle {
    private int capacity;
    private String portOfRegistration;


    public CShip(int capacity, String portOfRegistration) {
        this.capacity = capacity;
        this.portOfRegistration = portOfRegistration;
    }

    public CShip(double price, int year, double speed, int x, int y, int capacity, String portOfRegistration) {
        //super(price, year, speed, x, y);
        this.capacity = capacity;
        this.portOfRegistration = portOfRegistration;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPortOfRegistration() {
        return portOfRegistration;
    }

    public void setPortOfRegistration(String portOfRegistration) {
        this.portOfRegistration = portOfRegistration;
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
}
