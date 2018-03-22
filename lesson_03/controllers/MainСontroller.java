package controllers;

import entities.CCar;
import entities.CPlane;
import entities.CShip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainСontroller {
    public static void main(String[] args) throws IOException {
        VehicleController dao = new VehicleController();
        dao.save(new CCar(130, 2005, 90, 2, 7));
        dao.save(new CCar(12011, 2016, 200, 9, 4));
        dao.save(new CCar(7101, 2016, 101, 3, 9));
        dao.save(new CCar(312111, 2017, 300, 4, 3));
        dao.save(new CCar(2110111, 2003, 190, 6, 1));
        dao.save(new CCar(1111, 2001, 220, 4, 5));
        dao.save(new CCar(5611, 2015, 80, 6, 5));
        dao.save(new CShip(53531, 2017, 140, 6, 2, 9000, "Ukraine"));
        dao.save(new CShip(253535, 2002, 150, 8, 3, 1090, "Holland"));
        dao.save(new CShip(35353, 2017, 120, 2, 4, 3222, "USA"));
        dao.save(new CShip(45533, 2013, 190, 5, 7, 910, "China"));
        dao.save(new CShip(50992, 2016, 180, 7, 7, 900, "Japan"));
        dao.save(new CShip(6009, 2007, 100, 3, 51, 400, "Australia"));
        dao.save(new CShip(535310, 2017, 70, 9, 2, 9000, "Ukraine"));
        dao.save(new CShip(75377, 2013, 140, 11, 2, 7000, "Ukraine"));
        dao.save(new CShip(773531, 2001, 50, 67, 2, 4000, "Germany"));
        dao.save(new CPlane(180000 , 2017 , 600 , 2 , 5 , 400 , 6200));
        dao.save(new CPlane(3810000 , 2011 , 400 , 3 , 9 , 800 , 3900));
        dao.save(new CPlane(1338000 , 2015 , 900 , 9 , 9 , 10 , 1800));

        System.out.println("==============");
        System.out.println("THATS OUR DATA");
        System.out.println("==============");

        System.out.println(dao.findAll());

        System.out.println("\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MenuController menuController = new MenuController(dao);
        int decision;
        menuController.showMenu();
        while (true) {
            decision = Integer.parseInt(reader.readLine());
            switch (decision) {
                case 1:
                    menuController.task1();
                    break;
                case 2:
                    menuController.task2();
                    break;
                case 3:
                    menuController.task3();
                    break;
                case 4:
                    menuController.task4();
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
