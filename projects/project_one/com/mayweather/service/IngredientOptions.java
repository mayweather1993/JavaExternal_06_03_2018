package com.mayweather.service;

import com.mayweather.entity.Ingredient;

import java.util.List;

public interface IngredientOptions {
    void addIngredientsToSalad(List<Ingredient> ingredients);

    double countCalories();

    void sortIngredientsByCalories();

    void sortIngredientsByWeight();

    void showIngredientsByCalories(double from, double to);
}
