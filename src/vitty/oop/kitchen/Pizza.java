package vitty.oop.kitchen;

public class Pizza extends Dish {
    // Builder
    public Pizza(String name) {
        super(name);
    }

    // Methods
    @Override
    public void prepare() {
        System.out.println("We are preparing Pizza");
    }

    @Override
    public void prepare(int time) {
        System.out.println("Pizza will be ready in " + time + " minutes");
    }
}
