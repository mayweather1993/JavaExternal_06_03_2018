package controller;

import entity.Ingredient;
import service.IngredientsException;
import service.IngredientService;

class IngredientController {
    private IngredientService ingredientService;

    IngredientController(IngredientService saladController) {
        this.ingredientService = saladController;
    }

    void add(Ingredient ingredient) {
        ingredientService.addIngredientToSalad(ingredient);
    }

    void recipe() throws IngredientsException {
        ingredientService.lookRecipe();
    }

    double count() {
        return ingredientService.countCalories();
    }

    void sortCalories() {
        ingredientService.sortIngredientsByCalories();
    }

    void sortWeight() {
        ingredientService.sortIngredientsByWeight();
    }

    void showByCalories(double from, double to) {
        ingredientService.showIngredientsByCalories(from, to);
    }
}
