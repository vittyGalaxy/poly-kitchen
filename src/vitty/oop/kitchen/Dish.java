package vitty.oop.kitchen;

public class Dish {
    protected String name;

    // Builder
    public Dish(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public void prepare(){}

    public void prepare(int time){}
}
