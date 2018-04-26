package com.mayweather.entity.custom_salads;

import com.mayweather.entity.Salad;
import com.mayweather.entity.ingredients.vegetables.*;

public class Vinaigrette extends Salad {

    public Vinaigrette() {
        setName("Vinaigrette");
        ingredients.add(new Cucumber.CucumberBuilder().weight(100).build());
        ingredients.add(new Garlic.GarlicBuilder().weight(23).build());
        ingredients.add(new Potatoes.PotatoBuilder().weight(90).build());
        ingredients.add(new Carrot.CarrotBuilder().weight(40).build());
        ingredients.add(new Peas.PeasBuilder().weight(50).build());
    }
}
