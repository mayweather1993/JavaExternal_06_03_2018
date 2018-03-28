package service;

import entity.Chef;
import entity.Ingredient;
import entity.Salad;

import java.util.List;

public class SaladService implements SaladKitchen {
    private Chef chef;
    private Salad salad;

    @Override
    public void addToChef(Salad salad) {
        chef.addSalad(salad);
    }

    @Override
    public List<Salad> findAll() {
        return chef.getSalads();
    }

    @Override
    public Salad createCustomSalad(String name , List<Ingredient> ingredients) {
        salad.setName(name);
        salad.setIngredients(ingredients);
        return salad;
    }
}
