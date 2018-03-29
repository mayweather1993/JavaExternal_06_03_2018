package service;

import entity.Chef;
import entity.Ingredient;
import entity.Salad;
import entity.custom_salads.KingSalad;
import entity.custom_salads.PekineseSalad;
import entity.custom_salads.StudentSalad;
import entity.custom_salads.Vinaigrette;

import java.util.ArrayList;
import java.util.List;

public class SaladService implements SaladKitchen {
    private Chef chef ;
    private Salad salad;
    private List<Salad> salads = new ArrayList<>();


    public SaladService() {
        salads.add(new KingSalad());
        salads.add(new PekineseSalad());
        salads.add(new StudentSalad());
        salads.add(new Vinaigrette());
    }

    @Override
    public void addToChef(Salad salad) {
        chef.addSalad(salad);
    }

    @Override
    public List<Salad> findAll() {
        return salads;
    }

    @Override
    public Salad createCustomSalad(String name, List<Ingredient> ingredients) {
        salad.setName(name);
        salad.setIngredients(ingredients);
        return salad;
    }
}
