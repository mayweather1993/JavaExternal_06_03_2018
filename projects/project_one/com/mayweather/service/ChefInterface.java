package service;


import entity.Chef;
import entity.Salad;

import java.util.List;

public interface ChefInterface {

    Chef findChefByName(String name);

    List<Salad> findAllSaladsOfYourChef(Chef chef);

    void addSaladToChef(Salad salad, Chef chef);

}
