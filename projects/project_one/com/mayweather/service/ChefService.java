package service;

import entity.Chef;
import entity.Salad;

import java.util.ArrayList;
import java.util.List;

public class ChefService implements ChefInterface {

    private List<Chef> chefs = new ArrayList<>();


    @Override
    public Chef findChefByName(String name) {
        return (Chef) chefs.stream().filter(good -> good.getName().equals(name));
    }

    @Override
    public List<Salad> findAllSaladsOfYourChef(Chef chef) {
        return chef.getSalads();
    }

    @Override
    public void addSaladToChef(Salad salad, Chef chef) {
        chef.addSalad(salad);
    }
}
