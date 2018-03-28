package controller;

import entity.Ingredient;
import service.IngredientsException;
import service.IngredientService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ChefMenuController {
    private static IngredientService ingredientService = new IngredientService();
    private static IngredientController controller = new IngredientController(ingredientService);


    public static void cooking() throws IOException, IngredientsException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int decision = 0;
        showMenu();
        while (true) {
            decision = Integer.parseInt(bufferedReader.readLine());
            switch (decision) {
                case 1:
                    System.out.println("That's your recipe");
                    controller.recipe();
                    showMenu();
                    break;
                case 2:
                    System.out.println("Lets add some ingredients to your salad");
                    controller.add(getIngredient(bufferedReader));
                    break;
                case 3:
                    System.out.println("Sorting your ingredients by calories");
                    controller.sortCalories();
                    showMenu();
                    break;
                case 4:
                    System.out.println("Sorting ingredients by weight");
                    controller.sortWeight();
                    showMenu();
                    break;
                case 5:
                    showIngredientsForCalories(bufferedReader);
                    showMenu();
                    break;
                case 6:
                    controller.count();
                    showMenu();
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("Hello,lets cook today.What do you want?");
        System.out.println("\nThats your options :");
        System.out.println("1. Show recipe");
        System.out.println("2. Add ingredient");
        System.out.println("3. Sort ingredients by calories");
        System.out.println("4. Sort ingredients by weight");
        System.out.println("5. Get ingredients for calories");
        System.out.println("6. Count calories");
        System.out.println("0. Exit");
    }

    private static void showIngredientsForCalories(BufferedReader reader) throws IOException {
        double lowerCalories, upperCalories;

        System.out.println("Lower limit :");
        lowerCalories = Double.parseDouble(reader.readLine());


        System.out.println("Enter the upper limit:");
        upperCalories = Double.parseDouble(reader.readLine());
        controller.showByCalories(lowerCalories, upperCalories);
    }

    @SuppressWarnings("Checked,all good")
    private static Ingredient getIngredient(BufferedReader bufferedReader) throws IOException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        String name;
        double weight;

        System.out.println("Enter the ingredient name:");
        name = bufferedReader.readLine();

        System.out.println("Enter the weight in g :");
        weight = Double.parseDouble(bufferedReader.readLine());


        Class[] parameters = {double.class};
        name = "com.mayweather.controller.ChefMenuController." + name;
        Class ingredientClass = Class.forName(name);
        Constructor constructor =
                ingredientClass.getDeclaredConstructor(parameters);

        return (Ingredient) constructor.newInstance(
                new Object[]{weight});
    }
}

