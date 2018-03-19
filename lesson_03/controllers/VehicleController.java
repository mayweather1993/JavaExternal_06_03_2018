package controllers;

import dao.VehicleDAO;
import entities.CCar;
import entities.CShip;
import entities.CVehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleController implements VehicleDAO {

    private static final int YEAR = 2018;

    private List<CVehicle> vehicles = new ArrayList<>();


    @Override
    public void save(CVehicle cVehicle) {
        vehicles.add(cVehicle);
    }

    @Override
    public List<CVehicle> findAll() {
        return vehicles;
    }

    @Override
    public CVehicle getVehicleWithMaxPrice() {
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
    public CVehicle filterYearSpeedPrice() {
        double minPrice = Double.MAX_VALUE;
        CVehicle vehicle = null;
        for (int i = 0; i < vehicles.size(); i++) {
            CVehicle loopVehicle = vehicles.get(i);
            if (loopVehicle.getYear() >= 2000 && loopVehicle.getYear() <= 2005
                    && loopVehicle.getSpeed() > 150
                    && loopVehicle.getPrice() < minPrice) {
                minPrice = loopVehicle.getPrice();
                vehicle = loopVehicle;
            }
        }
        return vehicle;
    }


    @Override
    public List<CVehicle> filterByNewestCars() {
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
    public List<CVehicle> filterShipsByYearDescOrder() {
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
