package entity.chef;

import entity.Chef;
import entity.custom_salads.KingSalad;
import entity.custom_salads.PekineseSalad;
import entity.custom_salads.StudentSalad;
import entity.custom_salads.Vinaigrette;

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
