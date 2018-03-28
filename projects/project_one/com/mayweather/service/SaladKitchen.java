package service;

import entity.Salad;

import java.util.List;

public interface SaladKitchen {
    void addToChef(Salad salad);
    List<Salad> findAll();
    Salad createCustomSalad();
}
