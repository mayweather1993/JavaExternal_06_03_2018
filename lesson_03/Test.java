import controllers.VehicleController;
import entities.CCar;
import entities.CShip;
import entities.CVehicle;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<CVehicle> vehicles = new ArrayList<>();
        VehicleController controller = new VehicleController();


        vehicles.add(new CCar(1100 , 2005 , 1011 , 1 , 5));
        vehicles.add(new CCar(11011 , 14 , 101 , 1 , 5));
        vehicles.add(new CCar(1101111 , 2016 , 10 , 1 , 5));
        vehicles.add(new CCar(1101111 , 2017 , 1011 , 1 , 5));
        vehicles.add(new CCar(1101111 , 15 , 10 , 1 , 5));
        vehicles.add(new CCar(1101111 , 15 , 101 , 1 , 5));
        vehicles.add(new CCar(1101111 , 2007 , 10 , 1 , 5));
        vehicles.add(new CShip(1 , 2017 , 140 , 2 , 5 , 3 , "Ukraine"));
        vehicles.add(new CShip(2 , 2002 , 140 , 2 , 5 , 3 , "Ukraine"));
        vehicles.add(new CShip(3 , 207 , 140 , 2 , 5 , 3 , "Ukraine"));
        vehicles.add(new CShip(4 , 2013 , 140 , 2 , 5 , 3 , "Ukraine"));
        vehicles.add(new CShip(5 , 2016 , 140 , 2 , 5 , 3 , "Ukraine"));
        vehicles.add(new CShip(6 , 2017 , 140 , 2 , 5 , 3 , "Ukraine"));


        System.out.println(controller.getVehicleWithMaxPrice(vehicles));
        System.out.println(controller.filterYearSpeedPrice(vehicles));
        System.out.println(controller.filterByNewestCars(vehicles));


        System.out.println(controller.filterShipsByYearDescOrder(vehicles));
    }
}
