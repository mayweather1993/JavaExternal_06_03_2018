package controllers;

import entities.CVehicle;

import java.util.List;

public class MenuController2 {
    private VehicleController2 vehicleController2;

    public MenuController2(VehicleController2 vehicleController2) {
        this.vehicleController2 = vehicleController2;
    }

    void findAll() {
        System.out.println("Our data ");
        List<CVehicle> vehicles = vehicleController2.findAll();
        System.out.println(vehicles);
    }

    void max() {
        System.out.println("Lets find amphibian with maximum speed");
        CVehicle maxspeed = vehicleController2.maxspeed();
        System.out.println("Fastest : " + maxspeed);
    }

    void min() {
        System.out.println("Lets find amphibian with minimum speed");
        CVehicle minspeed = vehicleController2.minspeed();
        System.out.println("Slowest : " + minspeed);
    }
    void speedOrder(){
        System.out.println("Lets sort by speed");
        vehicleController2.orderBySpeed();
        List<CVehicle> vehicles = vehicleController2.findAll();
        System.out.println(vehicles);
    }

    void quit() {
        System.out.println("Thanks.Bye.");
        System.exit(0);
    }

    void showMenu() {
        System.out.println("So,what you gonna do?");
        System.out.println("1.Find all data");
        System.out.println("2.Find fastest vehicle");
        System.out.println("3.Find slowest vehicle");
        System.out.println("4.Order by speed");
        System.out.println("5.Quit");
    }
}
