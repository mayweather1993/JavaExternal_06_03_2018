package entity.ingredients.vegetables;

import entity.Builder;
import entity.Ingredient;

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
