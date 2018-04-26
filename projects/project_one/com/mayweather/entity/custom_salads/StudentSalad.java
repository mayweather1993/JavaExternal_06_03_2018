package com.mayweather.entity.custom_salads;

import com.mayweather.entity.Salad;
import com.mayweather.entity.ingredients.vegetables.Cucumber;
import com.mayweather.entity.ingredients.vegetables.Garlic;
import com.mayweather.entity.ingredients.vegetables.Potatoes;

public class StudentSalad extends Salad {
    public StudentSalad() {
        setName("Economy");
        ingredients.add(new Potatoes.PotatoBuilder().weight(1000).build());
        ingredients.add(new Garlic.GarlicBuilder().weight(200).build());
        ingredients.add(new Cucumber.CucumberBuilder().weight(100).build());
    }
}
