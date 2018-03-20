package dao;

import entities.CVehicle;

import java.util.List;

public interface VehicleDAOlesson4 {

    void save(CVehicle cVehicle);

    List<CVehicle> findAll();

    CVehicle minspeed();

    CVehicle maxspeed();

}
