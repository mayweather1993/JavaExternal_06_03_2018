package com.mayweather.entity.ingredients.vegetables;

import com.mayweather.entity.Builder;
import com.mayweather.entity.Ingredient;

public class Potatoes extends Ingredient {
    private Potatoes(PotatoBuilder potatoBuilder) {
        name = "Potatoes";
        calories = 120;
        weight = potatoBuilder.weight;
        setVegetableCategory(VegetableCategory.CLUBBING);
    }

    public static class PotatoBuilder implements Builder {

        private double weight;

        public PotatoBuilder() {
        }

        public PotatoBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Potatoes build() {
            return new Potatoes(this);
        }
    }
}
