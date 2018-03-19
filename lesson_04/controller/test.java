package controller;

import entities.Batmobile;

public class test {
    public static void main(String[] args) {
        VehicleController2 vehicleController2 = new VehicleController2();
        vehicleController2.save(new Batmobile(100, 2017, 180, 4, 2));
        vehicleController2.save(new Batmobile(1000, 2017, 120, 4, 2));
        vehicleController2.save(new Batmobile(10000, 2017, 1220, 4, 2));

        System.out.println(vehicleController2.maxspeed());
        System.out.println(vehicleController2.minspeed());
    }
}
