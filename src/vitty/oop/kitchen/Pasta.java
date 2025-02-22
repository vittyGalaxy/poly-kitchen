package vitty.oop.kitchen;

public class Pasta extends Dish {
    // Builder
    public Pasta(String name) {
        super(name);
    }

    // Methods
    @Override
    public void prepare() {
        System.out.println("We are preparing the pasta");
    }

    @Override
    public void prepare(int time) {
        System.out.println("The pasta will be ready in " + time + " minutes");
    }
}
