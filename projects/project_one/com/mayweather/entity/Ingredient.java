package entity;

import entity.ingredients.vegetables.VegetableCategory;

public abstract class Ingredient {
    protected String name;
    protected double calories;
    protected double weight;
    private VegetableCategory vegetableCategory;

    public Ingredient() {
    }

    public Ingredient(String name, double calories, double weight, VegetableCategory vegetableCategory) throws CaloriesException, WeightException {
        this.name = name;
        if (calories <= 0) {
            throw new CaloriesException("Cannot create ingredient without any calories");
        }
        this.calories = calories;
        if (weight <= 0) {
            throw new WeightException("Cannot create ingredient without any weight");
        }
        this.weight = weight;
        this.vegetableCategory = vegetableCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public VegetableCategory getVegetableCategory() {
        return vegetableCategory;
    }

    public void setVegetableCategory(VegetableCategory vegetableCategory) {
        this.vegetableCategory = vegetableCategory;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                "calories=" + calories +
                "weight=" + weight +
                '}' + "\n";
    }

    public double getTotalCalories() {
        return calories * weight / 100;
    }
}
