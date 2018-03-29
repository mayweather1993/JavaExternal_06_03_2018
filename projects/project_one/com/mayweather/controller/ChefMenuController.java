package controller;

import entity.Ingredient;
import entity.Salad;
import entity.chef.InnaGrechana;
import service.IngredientService;
import service.SaladService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ChefMenuController {
    private static IngredientService ingredientService = new IngredientService();
    private static SaladService saladService = new SaladService();
    private static SaladController saladController = new SaladController(saladService);
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static InnaGrechana innaGrechana = new InnaGrechana();


    /*public static void cooking() throws IOException, IngredientsException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException {
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
    } */


    /* public static void menu1() {
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         int decision = 0;
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
     */
    public static void main(String[] args) throws IOException {
        greetingMenu();
    }

    public static void greetingMenu() throws IOException {
        List<Salad> salads = saladController.findAllSalads();


        System.out.println("Hello my friend");
        System.out.println("This is our menu : ");
        for (int i = 0; i < salads.size(); i++) {
            Salad salad = salads.get(i);
            ingredientService.addIngredientsToSalad(salad.getIngredients());
            System.out.printf("%d %s (%f) \n", i, salad.getName() , ingredientService.countCalories());

        }

        System.out.println("if you want to quit press 4");


        System.out.println("Choose your salad yo eat : ");
        int decision = 0;
        while (decision != 4) {
            decision = Integer.parseInt(bufferedReader.readLine());
            if (decision > salads.size() || decision < 0) {
                System.out.println("We dont have your salad");
                continue;
            }
            Salad salad = salads.get(decision);
            List<Ingredient> ingredients = salad.getIngredients();
            ingredientService.addIngredientsToSalad(salad.getIngredients());

            System.out.println("Your salad : " + salad);
            System.out.println("4.Sort by weight");
            System.out.println("5.Sort by calories");
            decision = Integer.parseInt(bufferedReader.readLine());
            if(decision == 4){
                System.out.println("Before: " + ingredients);
                ingredientService.sortIngredientsByWeight();
                System.out.println("After: " + ingredients);
            }
            else if(decision==5){
                System.out.println("Before: " + ingredients);
                ingredientService.sortIngredientsByCalories();
                System.out.println("After: " + ingredients);
            }
            System.out.println("6.Find the vegetables in the salad, corresponding to a given range of calories");
            decision = Integer.parseInt(bufferedReader.readLine());
            if(decision == 6){
                ingredientService.showIngredientsByCalories(20 , 40);
            }
        }
    }
}


