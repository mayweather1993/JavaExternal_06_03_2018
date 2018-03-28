package entity;

public class Chef {
    private String name;
    private Salad salad;

    public Chef(String name) {
        this.name = name;
    }

    public Chef(String name, Salad salad) {
        this.name = name;
        this.salad = salad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salad getSalad() {
        return salad;
    }

    public void setSalad(Salad salad) {
        this.salad = salad;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", salad=" + salad +
                '}';
    }
}
