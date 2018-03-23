package factory;

import entities.CVehicle;

public abstract class AbstractFactory {

    public abstract CVehicle getVehicle(int number);

    public abstract CVehicle randomVehicle();
}
