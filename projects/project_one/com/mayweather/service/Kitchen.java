package service;

import entity.Ingredient;

public interface Kitchen {
    void addIngredientToSalad(Ingredient ingredient);

    void lookRecipe() throws IngredientsException;

    double countCalories();

    void sortIngredientsByCalories();

    void sortIngredientsByWeight();

    void showIngredientsByCalories(double from, double to);
}
