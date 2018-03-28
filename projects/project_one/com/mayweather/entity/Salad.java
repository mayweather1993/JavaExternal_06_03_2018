package entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Salad {
    protected String name;
    protected List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public String toString() {
        return "Salad{" +
                "name='" + name + '\'' +
                ", salad=" + ingredients +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setSalad(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
