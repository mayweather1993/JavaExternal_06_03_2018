package controllers;

import entities.CVehicle;

import java.util.List;

public class MenuController {

    private VehicleController controller;

    public MenuController(VehicleController controller) {
        this.controller = controller;
    }

    void task1() {
        System.out.println("Ok, lets find most expensive vehicles in our data");
        CVehicle vehicleWithMaxPrice = controller.getVehicleWithMaxPrice();
        System.out.println("Most expensive vehicle : " + vehicleWithMaxPrice);
    }

    void task2() {
        System.out.println("Lets find a vehicle with with 2000 - 2005 year productivity , speed more than 150 , and lowest price");
        CVehicle vehicle = controller.filterYearSpeedPrice();
        System.out.println("Ok lets check.This is : " + vehicle);
    }

    void task3() {
        System.out.println("Lets find a cars no older than 5 years");
        List<CVehicle> cars = controller.filterByNewestCars();
        System.out.println("That's most newest cars : \n" + cars);
    }

    void task4() {
        System.out.println("Lets find a ships no older than 5 years and sorted in descending order");
        List<CVehicle> ships = controller.filterShipsByYearDescOrder();
        System.out.println("That's most newest ships in descending order + \n" + ships);
    }

    void quit() {
        System.out.println("Ok bye");
        System.exit(0);
    }

    void showMenu() {
        System.out.println("So,what you gonna do? ");
        System.out.println("1.Task_01");
        System.out.println("2.Task_02");
        System.out.println("3.Task_03");
        System.out.println("4.Task_04");
        System.out.println("5.Quit a program");
    }
}
