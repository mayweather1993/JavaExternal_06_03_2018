package controllers;

import entities.Amphibian;
import entities.Batmobile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController2 {
    public static void main(String[] args) throws IOException {
        VehicleController2 dao = new VehicleController2();
        dao.save(new Amphibian(130, 2005, 90, 2, 7));
        dao.save(new Batmobile(12011, 2016, 200, 9, 4));
        dao.save(new Amphibian(7101, 2016, 101, 3, 9));
        dao.save(new Amphibian(312111, 2017, 300, 4, 3));
        dao.save(new Batmobile(2110111, 2003, 190, 6, 1));
        dao.save(new Batmobile(1111, 2001, 220, 4, 5));
        dao.save(new Batmobile(5611, 2015, 80, 6, 5));
        dao.save(new Amphibian(53531, 2017, 140, 6, 2));
        dao.save(new Amphibian(253535, 2002, 150, 8, 3));


        System.out.println("==============");
        System.out.println("THATS OUT DATA");
        System.out.println("==============");

        System.out.println("\n");

        System.out.println(dao.findAll());


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MenuController2 menuController = new MenuController2(dao);
        int decision;
        menuController.showMenu();
        while (true) {
            decision = Integer.parseInt(reader.readLine());
            switch (decision) {
                case 1:
                    menuController.findAll();
                    break;
                case 2:
                    menuController.max();
                    break;
                case 3:
                    menuController.min();
                    break;
                case 4:
                    menuController.quit();
                    break;
                default:
                    System.out.println("Please enter 1 - 4");
            }
        }

    }
}
