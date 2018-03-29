package service;

import entity.Ingredient;
import entity.Salad;

import java.util.List;

public interface SaladKitchen {
    void addToChef(Salad salad);

    List<Salad> findAll();

    Salad createCustomSalad(String name, List<Ingredient> ingredients);

    void addDefaultSaladsToChef();
}
