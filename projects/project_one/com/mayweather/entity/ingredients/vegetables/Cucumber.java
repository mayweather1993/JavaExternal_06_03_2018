package com.mayweather.entity.ingredients.vegetables;

import com.mayweather.entity.Builder;
import com.mayweather.entity.Ingredient;

public class Cucumber extends Ingredient {
    public Cucumber(CucumberBuilder cucumberBuilder) {
        name = "Cucumber";
        calories = 47;
        weight = cucumberBuilder.weight;
        setVegetableCategory(VegetableCategory.PUMPKIN);
    }

    public static class CucumberBuilder implements Builder {

        private double weight;

        public CucumberBuilder() {
        }

        public CucumberBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Cucumber build() {
            return new Cucumber(this);
        }
    }
}
