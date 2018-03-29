package controller;

import entity.Chef;
import entity.Salad;
import service.ChefService;

import java.util.List;

public class ChefController {
    private ChefService chefService;

    public ChefController(ChefService chefService) {
        this.chefService = chefService;
    }

    public Chef find(String name) {
        return chefService.findChefByName(name);
    }

    public List<Salad> findAllSalads(Chef chef) {
        return chefService.findAllSaladsOfYourChef(chef);
    }

    public void addSalad(Salad salad, Chef chef) {
        chefService.addSaladToChef(salad, chef);
    }
}
