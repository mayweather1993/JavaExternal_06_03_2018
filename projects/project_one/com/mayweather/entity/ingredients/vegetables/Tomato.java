package com.mayweather.entity.ingredients.vegetables;

import com.mayweather.entity.Builder;
import com.mayweather.entity.Ingredient;

public class Tomato extends Ingredient {

    private Tomato(TomatoBuilder tomatoBuilder) {
        name = "Tomato";
        calories = 60;
        weight = tomatoBuilder.weight;
        setVegetableCategory(VegetableCategory.TOMATO);
    }

    public static class TomatoBuilder implements Builder {

        private double weight;

        public TomatoBuilder() {
        }

        public TomatoBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Tomato build() {
            return new Tomato(this);
        }
    }
}
