package entity.chef;

import entity.Chef;
import entity.Salad;
import entity.custom_salads.StudentSalad;

import java.util.List;

public class PavelKozachek extends Chef {

    public PavelKozachek(String name, List<Salad> salads) {
        super("Pasha", salads);
        addSalad(new StudentSalad());
    }
}
