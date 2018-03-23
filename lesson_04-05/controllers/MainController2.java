package controllers;

import entities.Amphibian;
import entities.Batmobile;
import entities.CCar;
import enums.Fuel;
import enums.TransmissionVariety;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController2 {
    public static void main(String[] args) throws IOException {
        VehicleController2 dao = new VehicleController2();
        dao.save(new Amphibian.AmphibiaBuilder().price(190000).year(2013).
                speed(130).x(22).y(1).engine(new CCar.CarEngine(Fuel.DIESEL, 340)).
                transmission(new CCar.Transmission(TransmissionVariety.VARIATOR))
                .build());
        dao.save(new Amphibian.AmphibiaBuilder().price(9000).year(2001).
                speed(30).x(8).y(3).engine(new CCar.CarEngine(Fuel.A95, 40)).
                transmission(new CCar.Transmission(TransmissionVariety.AUTOMATIC))
                .build());
        dao.save(new Batmobile.BatBuilder().price(204000).year(2017).
                speed(330).x(2).y(5).engine(new CCar.CarEngine(Fuel.ELECTRIC, 1000)).
                transmission(new CCar.Transmission(TransmissionVariety.AUTOMATIC))
                .build());
        dao.save(new Batmobile.BatBuilder().price(4000).year(1999).
                speed(30).x(21).y(15).engine(new CCar.CarEngine(Fuel.A98, 100)).
                transmission(new CCar.Transmission(TransmissionVariety.VARIATOR))
                .build());


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MenuController2 menuController = new MenuController2(dao);
        int decision;
        menuController.showMenu();
        while (true) {
            decision = Integer.parseInt(reader.readLine());
            switch (decision) {
                case 1:
                    menuController.findAll();
                    menuController.showMenu();
                    break;
                case 2:
                    menuController.max();
                    menuController.showMenu();
                    break;
                case 3:
                    menuController.min();
                    menuController.showMenu();
                    break;
                case 4:
                    menuController.speedOrder();
                    menuController.showMenu();
                    break;
                case 5:
                    menuController.quit();
                    break;
                default:
                    System.out.println("Please enter 1 - 5");
            }
        }

    }
}
