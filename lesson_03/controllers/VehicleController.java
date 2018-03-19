package controllers;

import dao.VehicleDAO;
import entities.CCar;
import entities.CShip;
import entities.CVehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleController implements VehicleDAO {

    private static final int YEAR = 2018;


    @Override
    public CVehicle getVehicleWithMaxPrice(List<CVehicle> vehicles) {
        double maxPrice = 0;
        CVehicle vehicle = null;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPrice() > maxPrice) {
                maxPrice = vehicles.get(i).getPrice();
                vehicle = vehicles.get(i);
            }
        }
        return vehicle;
    }


    @Override
    public List<CVehicle> filterYearSpeedPrice(List<CVehicle> vehicles) {
        double minimum = Double.MIN_VALUE;
        CVehicle vehicle;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getYear() >= 2000 && vehicles.get(i).getYear() <= 2005
                    && vehicles.get(i).getSpeed() > 150
                    && vehicles.get(i).getPrice() < minimum) {
                vehicle = vehicles.get(i);
                minimum = vehicles.get(i).getPrice();
                vehicles.add(vehicle);
            }
        }
        return vehicles;
    }


    @Override
    public List<CVehicle> filterByNewestCars(List<CVehicle> vehicles) {
        List<CVehicle> cars = new ArrayList<>();
        CVehicle car = null;
        for (int i = 0; i < vehicles.size(); i++) {
            car = vehicles.get(i);
            if (car instanceof CCar && YEAR - car.getYear() <= 5) {
                cars.add(vehicles.get(i));
            }
        }
        return cars;

    }

    @Override
    public List<CVehicle> filterShipsByYearDescOrder(List<CVehicle> vehicles) {
        List<CVehicle> ships = new ArrayList<>();
        CVehicle ship = null;

        for (int i = 0; i < vehicles.size(); i++) {
            ship = vehicles.get(i);
            if (ship instanceof CShip && YEAR - ship.getYear() <= 5) {
                ships.add(ship);
                ships.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
            }
        }
        return ships;
    }
}
