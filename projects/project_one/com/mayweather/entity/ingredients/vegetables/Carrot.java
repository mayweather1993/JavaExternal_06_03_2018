package com.mayweather.entity.ingredients.vegetables;

import com.mayweather.entity.Builder;
import com.mayweather.entity.Ingredient;

public class Carrot extends Ingredient {

    private Carrot(CarrotBuilder carrotBuilder) {
        name = "Carrot";
        calories = 40;
        weight = carrotBuilder.weight;
        setVegetableCategory(VegetableCategory.ROOTS);
    }

    public static class CarrotBuilder implements Builder {

        private double weight;

        public CarrotBuilder() {
        }

        public CarrotBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Carrot build() {
            return new Carrot(this);
        }
    }
}
