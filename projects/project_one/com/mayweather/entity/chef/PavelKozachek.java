package com.mayweather.entity.chef;

import com.mayweather.entity.Chef;
import com.mayweather.entity.Salad;
import com.mayweather.entity.custom_salads.StudentSalad;

import java.util.List;

public class PavelKozachek extends Chef {

    public PavelKozachek(List<Salad> salads) {
        super("Pasha", salads);
        addSalad(new StudentSalad());
    }
}
