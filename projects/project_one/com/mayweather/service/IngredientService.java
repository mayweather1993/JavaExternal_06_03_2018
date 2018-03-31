package service;

import entity.Ingredient;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IngredientService implements IngredientOptions {

    private List<Ingredient> ingredients = new ArrayList<>();


    @Override
    public void addIngredientsToSalad(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public double countCalories() {
        double totalCalories = 0;

        for (Ingredient ingredient :
                ingredients) {
            totalCalories += ingredient.getTotalCalories();
        }
        return totalCalories;
    }

    @Override
    public void sortIngredientsByCalories() {
        ingredients.sort((Comparator.comparingDouble(Ingredient::getCalories)));
    }

    @Override
    public void sortIngredientsByWeight() {
        ingredients.sort((Comparator.comparingDouble(Ingredient::getWeight)));
    }

    @Override
    public void showIngredientsByCalories(double from, double to) {
        double calories;
        System.out.println("Finding ingredients for calories from " + from + " to " + to);
        for (Ingredient ingredient :
                ingredients
                ) {
            calories = ingredient.getCalories();
            if (calories >= from && calories <= to) {
                System.out.println(ingredient.getName() + " , " + ingredient.getCalories() + " calories per 100g");
            }
        }
    }
}
