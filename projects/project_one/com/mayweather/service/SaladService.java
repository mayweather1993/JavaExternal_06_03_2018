package com.mayweather.service;

import com.mayweather.entity.Salad;
import com.mayweather.entity.custom_salads.KingSalad;
import com.mayweather.entity.custom_salads.PekineseSalad;
import com.mayweather.entity.custom_salads.StudentSalad;
import com.mayweather.entity.custom_salads.Vinaigrette;

import java.util.ArrayList;
import java.util.List;

public class SaladService implements SaladKitchen {
    private List<Salad> salads = new ArrayList<>();


    public SaladService() {
        salads.add(new KingSalad());
        salads.add(new PekineseSalad());
        salads.add(new StudentSalad());
        salads.add(new Vinaigrette());
    }

    @Override
    public List<Salad> findAll() {
        return salads;
    }
}
