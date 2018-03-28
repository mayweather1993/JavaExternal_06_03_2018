package entity.ingredients.vegetables;

import entity.Builder;
import entity.Ingredient;

public class Peas extends Ingredient {
    private Peas(PeasBuilder peasBuilder) {
        name = "Peas";
        calories = 50;
        weight = peasBuilder.weight;
        setVegetableCategory(VegetableCategory.BEANS);
    }

    public static class PeasBuilder implements Builder {
        private double weight;

        public PeasBuilder() {
        }

        public PeasBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Peas build() {
            return new Peas(this);
        }
    }
}

