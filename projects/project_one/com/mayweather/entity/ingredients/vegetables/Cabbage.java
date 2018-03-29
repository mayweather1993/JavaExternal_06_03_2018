package entity.ingredients.vegetables;

import entity.Builder;
import entity.Ingredient;

public class Cabbage extends Ingredient {
    private Cabbage(CabbageBuilder cabbageBuilder) {
        name = "Cabbage";
        calories = 30;
        weight = cabbageBuilder.weight;
        setVegetableCategory(VegetableCategory.CABBAGE);
    }

    public static class CabbageBuilder implements Builder {

        private double weight;

        public CabbageBuilder() {
        }

        public CabbageBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Cabbage build() {
            return new Cabbage(this);
        }
    }
}
