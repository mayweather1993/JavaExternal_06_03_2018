package com.mayweather.controller;

import com.mayweather.entity.Ingredient;
import com.mayweather.entity.Salad;
import com.mayweather.service.IngredientService;
import com.mayweather.service.SaladService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ChefMenuController {
    private static IngredientService ingredientService = new IngredientService();
    private static SaladService saladService = new SaladService();
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        saladMenu();
    }

    private static void saladMenu() throws IOException {
        List<Salad> salads = saladService.findAll();
        System.out.println("Hello my friend");
        System.out.println("This is our menu : ");
        for (int i = 0; i < salads.size(); i++) {
            Salad salad = salads.get(i);
            ingredientService.addIngredientsToSalad(salad.getIngredients());
            System.out.printf("%d %s (%f) \n", i, salad.getName(), ingredientService.countCalories());
        }
        System.out.println("If you wanna quit press 4");
        System.out.println("Choose your salad yo eat : ");
        int decision = 0;
        while (decision != 4) {
            decision = Integer.parseInt(bufferedReader.readLine());
            if (decision > salads.size() || decision < 0) {
                System.out.println("We don't have your salad");
                continue;
            }
            if (decision == 4) {
                System.out.println("Good bye");
                System.exit(0);
            }
            Salad salad = salads.get(decision);
            List<Ingredient> ingredients = salad.getIngredients();
            ingredientService.addIngredientsToSalad(ingredients);
            System.out.println("Your salad : " + salad);
            while (true) {
                System.out.println("4.Sort by weight");
                System.out.println("5.Sort by calories");
                System.out.println("6.Find the vegetables in the salad, corresponding to a given range of calories");
                System.out.println("7.Exit the program");
                decision = Integer.parseInt(bufferedReader.readLine());
                if (decision == 4) {
                    System.out.println("Before: " + ingredients);
                    ingredientService.sortIngredientsByWeight();
                    System.out.println("After: " + ingredients);
                } else if (decision == 5) {
                    System.out.println("Before: " + ingredients);
                    ingredientService.sortIngredientsByCalories();
                    System.out.println("After: " + ingredients);
                } else if (decision == 6) {
                    ingredientService.showIngredientsByCalories(20, 40);
                } else if (decision == 7) {
                    System.out.println("Good bye");
                    System.exit(0);
                } else {
                    System.out.println("Press 4 - 7 thanks");
                }
            }
        }
    }
}


