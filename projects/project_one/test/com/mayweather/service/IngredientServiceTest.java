package com.mayweather.service;

import com.mayweather.entity.Ingredient;
import com.mayweather.entity.ingredients.vegetables.Cabbage;
import com.mayweather.entity.ingredients.vegetables.Carrot;
import com.mayweather.entity.ingredients.vegetables.Cucumber;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class IngredientServiceTest {

    private IngredientService ingredientService;

    private Cabbage cabbage;

    private Carrot carrot;

    private Cucumber cucumber;

    private List<Ingredient> ingredients;


    @Test
    public void getIngredients() {
        ingredients.add(cabbage);
        List<Ingredient> ingredients = ingredientService.getIngredients();
        int size = ingredients.size();
        assertEquals(1, size);
    }

    @Test
    public void countCalories() {
        ingredients.add(cabbage);
        double calories = ingredientService.countCalories();
        assertEquals(30.0, calories, 0.0);
    }

    @Test
    public void sortIngredientsByCalories() {
        ingredients.add(cucumber);
        ingredients.add(cabbage);
        ingredients.add(carrot);
        ingredientService.sortIngredientsByCalories();
        assertEquals(30, ingredients.get(0).getCalories(), 0.0);

    }

    @Test
    public void sortIngredientsByWeight() {
        cucumber.setWeight(100);
        cabbage.setWeight(40);
        ingredients.add(cucumber);
        ingredients.add(cabbage);
        ingredientService.sortIngredientsByWeight();
        assertEquals(40, ingredients.get(0).getWeight(), 0.0);
    }

    @Test
    public void showIngredientsByCalories() {
        int from = 20;
        int to = 39;
        ingredients.add(carrot);
        ingredients.add(cabbage);
        ingredients.add(cucumber);
        ingredientService.showIngredientsByCalories(from, to);
    }
}
