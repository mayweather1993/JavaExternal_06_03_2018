package entity.ingredients.vegetables;

import entity.Builder;
import entity.Ingredient;

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
