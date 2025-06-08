package vitty.oop.kitchen;

public class Dessert extends Dish {
    // Builder
    public Dessert (String name) {
        super(name);
    }

    // Methods
    @Override
    public void prepare() {
        System.out.println("We are preparing " + name);
    }

    @Override
    public void prepare(int time) {
        System.out.println(name + " will be ready in " + time + " minutes");
    }
}