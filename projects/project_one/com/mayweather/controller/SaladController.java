package controller;

import entity.Ingredient;
import service.IngredientsException;
import service.SaladService;

class SaladController {
    private SaladService saladService;

    SaladController(SaladService saladController) {
        this.saladService = saladController;
    }

    void add(Ingredient ingredient) {
        saladService.addIngredientToSalad(ingredient);
    }

    void recipe() throws IngredientsException {
        saladService.lookRecipe();
    }

    double count() {
        return saladService.countCalories();
    }

    void sortCalories() {
        saladService.sortIngredientsByCalories();
    }

    void sortWeight() {
        saladService.sortIngredientsByWeight();
    }

    void showByCalories(double from, double to) {
        saladService.showIngredientsByCalories(from, to);
    }
}
