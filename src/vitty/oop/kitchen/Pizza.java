package vitty.oop.kitchen;

public class Pizza extends Dish {
    // Builder
    public Pizza(String name) {
        super(name);
    }

    // Methods
    @Override
    public void prepare() {
        System.out.println("Stiamo preparando la PIZZA");
    }

    @Override
    public void prepare(int time) {
        System.out.println("La PIZZA sara' pronta tra " + time + " minuti");
    }
}
