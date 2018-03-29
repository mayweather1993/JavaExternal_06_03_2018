package entity.custom_salads;

import entity.Salad;
import entity.ingredients.vegetables.Cabbage;
import entity.ingredients.vegetables.Dill;
import entity.ingredients.vegetables.Tomato;

public class PekineseSalad extends Salad {
    public PekineseSalad() {
        setName("Pekinese winter salad");
        ingredients.add(new Cabbage.CabbageBuilder().weight(100).build());
        ingredients.add(new Cabbage.CabbageBuilder().weight(30).build());
        ingredients.add(new Dill.DillBuilder().weight(500).build());
        ingredients.add(new Tomato.TomatoBuilder().weight(400).build());
    }
}
