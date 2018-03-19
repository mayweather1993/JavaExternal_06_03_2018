package controller;

import dao.VehicleDAOlesson4;
import entities.CVehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VehicleController2 implements VehicleDAOlesson4 {

    private List<CVehicle> vehicles = new ArrayList<>();


    @Override
    public void save(CVehicle cVehicle) {
        vehicles.add(cVehicle);
    }

    @Override
    public CVehicle maxspeed() {
        return Collections.max(vehicles, Comparator.comparingDouble(CVehicle::getSpeed));
    }

    @Override
    public CVehicle minspeed() {
        return Collections.min(vehicles, Comparator.comparingDouble(CVehicle::getSpeed));
    }
}