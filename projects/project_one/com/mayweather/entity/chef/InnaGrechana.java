package com.mayweather.entity.chef;

import com.mayweather.entity.Chef;
import com.mayweather.entity.custom_salads.KingSalad;
import com.mayweather.entity.custom_salads.PekineseSalad;
import com.mayweather.entity.custom_salads.StudentSalad;
import com.mayweather.entity.custom_salads.Vinaigrette;

import java.util.ArrayList;

public class InnaGrechana extends Chef {

    public InnaGrechana() {
        super("Inna", new ArrayList<>());
        addSalad(new KingSalad());
        addSalad(new PekineseSalad());
        addSalad(new StudentSalad());
        addSalad(new Vinaigrette());
    }
}
