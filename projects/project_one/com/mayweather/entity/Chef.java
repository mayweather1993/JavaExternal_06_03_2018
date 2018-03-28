package entity;

import java.util.List;

public class Chef {
    private String name;
    private List<Salad> salads;

    public Chef(String name) {
        this.name = name;
    }

    public Chef(String name, List<Salad> salad) {
        this.name = name;
        this.salads = salad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Salad> getSalads() {
        return salads;
    }

    public void setSalads(List<Salad> salads) {
        this.salads = salads;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", salads=" + salads +
                '}';
    }

    public void addSalad(Salad salad) {
        salads.add(salad);
    }
}
