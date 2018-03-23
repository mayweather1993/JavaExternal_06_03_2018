package factory;

import entities.CCar;
import entities.CVehicle;

import java.util.Random;

public class CVehicleFactory extends AbstractFactory {
    //number of our types of vehicles
    private final int TOTAL_SUM_VEHICLES = 5;

    private Random random;

    @Override
    public CVehicle getVehicle(int number) {
        switch (number) {
            case 0:
                return new CCar.CarBuilder().price(price()).year(year()).speed(speed()).
                        x(x()).y(y()).build();
        }
        return null;
    }

    @Override
    public CVehicle randomVehicle() {
        return getVehicle((int) (Math.random() * TOTAL_SUM_VEHICLES));
    }

    double price() {
        return random.nextInt(1000000);
    }

    int year() {
        int i = random.nextInt(10);
        return 2018 - i;
    }

    int speed() {
        return random.nextInt(500);
    }

    int x() {
        return random.nextInt(20);
    }

    int y() {
        return random.nextInt(15);
    }

    int capacity() {
        return random.nextInt(500);
    }

    int height() {
        return random.nextInt(7000);
    }
}
