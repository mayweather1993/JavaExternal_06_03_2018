package entity.custom_salads;

import entity.Salad;
import entity.ingredients.vegetables.Cucumber;
import entity.ingredients.vegetables.Garlic;
import entity.ingredients.vegetables.Potatoes;

public class StudentSalad extends Salad {
    public StudentSalad() {
        setName("Economy");
        ingredients.add(new Potatoes.PotatoBuilder().weight(1000).build());
        ingredients.add(new Garlic.GarlicBuilder().weight(200).build());
        ingredients.add(new Cucumber.CucumberBuilder().weight(100).build());
    }
}
