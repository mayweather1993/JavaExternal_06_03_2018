package dao;

import entities.CVehicle;

import java.util.List;

public interface VehicleDAO {
    void save(CVehicle cVehicle);

    List<CVehicle> findAll();

    CVehicle getVehicleWithMaxPrice();

    CVehicle filterYearSpeedPrice();

    List<CVehicle> filterByNewestCars();

    List<CVehicle> filterShipsByYearDescOrder();
}
