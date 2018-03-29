package entity.chef;

import entity.Chef;
import entity.Salad;
import entity.custom_salads.KingSalad;
import entity.custom_salads.PekineseSalad;
import entity.custom_salads.StudentSalad;
import entity.custom_salads.Vinaigrette;

import java.util.List;

public class InnaGrechana extends Chef {

    public InnaGrechana(String name, List<Salad> salads) {
        super("Inna", salads);
        addSalad(new KingSalad());
        addSalad(new PekineseSalad());
        addSalad(new StudentSalad());
        addSalad(new Vinaigrette());
    }
}
