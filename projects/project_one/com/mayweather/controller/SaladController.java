package controller;

import entity.Ingredient;
import entity.Salad;
import service.SaladService;

import java.util.List;

public class SaladController {

    private SaladService saladService;

    public SaladController(SaladService saladService) {
        this.saladService = saladService;
    }

    public void addSaladToChef(Salad salad) {
        saladService.addToChef(salad);
    }

    public List<Salad> findAllSalads() {
        return saladService.findAll();
    }

    public Salad createCustomSalad(String name, List<Ingredient> ingredients) {
        return saladService.createCustomSalad(name, ingredients);
    }
}
