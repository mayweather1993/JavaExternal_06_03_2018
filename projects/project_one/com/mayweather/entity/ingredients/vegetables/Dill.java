package com.mayweather.entity.ingredients.vegetables;

import com.mayweather.entity.Builder;
import com.mayweather.entity.Ingredient;

public class Dill extends Ingredient {

    private Dill(DillBuilder dillBuilder) {
        name = "Dill";
        calories = 12;
        weight = dillBuilder.weight;
        setVegetableCategory(VegetableCategory.SPICY);
    }

    public static class DillBuilder implements Builder {

        private double weight;

        public DillBuilder() {
        }

        public DillBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Dill build() {
            return new Dill(this);
        }
    }
}

