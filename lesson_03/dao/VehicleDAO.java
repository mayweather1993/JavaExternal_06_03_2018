package dao;

import entities.CVehicle;

import java.util.List;

public interface VehicleDAO {
    CVehicle getVehicleWithMaxPrice(List<CVehicle> vehicles);

    List<CVehicle> filterYearSpeedPrice(List<CVehicle> vehicles);

    List<CVehicle> filterByNewestCars(List<CVehicle> vehicles);

    List<CVehicle> filterShipsByYearDescOrder(List<CVehicle> vehicles);
}
