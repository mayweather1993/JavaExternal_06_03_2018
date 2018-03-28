package entity.ingredients.vegetables;

import entity.Builder;
import entity.Ingredient;

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

