package dao;

import entities.CVehicle;

import java.util.List;

public interface VehicleDAO2 {

    void save(Builder builder);

    List<CVehicle> findAll();

    CVehicle minspeed();

    CVehicle maxspeed();

}
