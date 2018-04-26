package com.mayweather.entity.custom_salads;

import com.mayweather.entity.Salad;
import com.mayweather.entity.ingredients.vegetables.Cabbage;
import com.mayweather.entity.ingredients.vegetables.Peas;
import com.mayweather.entity.ingredients.vegetables.Tomato;

public class KingSalad extends Salad {
    public KingSalad() {
        setName("Just a king");
        ingredients.add(new Tomato.TomatoBuilder().weight(50).build());
        ingredients.add(new Cabbage.CabbageBuilder().weight(400).build());
        ingredients.add(new Peas.PeasBuilder().weight(400).build());
    }
}
