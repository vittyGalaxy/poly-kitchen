package vitty.oop.kitchen;

public class Pasta extends Dish {
    // Builder
    public Pasta(String name) {
        super(name);
    }

    // Methods
    @Override
    public void prepare() {
        System.out.println("Stiamo preparando la pasta");
    }

    @Override
    public void prepare(int time) {
        System.out.println("La pasta sara' pronta tra " + time + " minuti");
    }
}
