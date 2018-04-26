package com.mayweather.entity.ingredients.vegetables;

import com.mayweather.entity.Builder;
import com.mayweather.entity.Ingredient;

public class Garlic extends Ingredient {
    private Garlic(GarlicBuilder garlicBuilder) {
        name = "Garlic";
        calories = 3;
        weight = garlicBuilder.weight;
        setVegetableCategory(VegetableCategory.BULBOUS);
    }

    public static class GarlicBuilder implements Builder {

        private double weight;

        public GarlicBuilder() {
        }

        public GarlicBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Garlic build() {
            return new Garlic(this);
        }
    }
}
