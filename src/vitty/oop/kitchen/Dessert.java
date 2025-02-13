package vitty.oop.kitchen;

public class Dessert extends Dish {
    // Builder
    public Dessert(String name) {
        super(name);
    }

    // Methods
    @Override
    public void prepare() {
        System.out.println("Stiamo preparando il dolce");
    }

    @Override
    public void prepare(int time) {
        System.out.println("Il dolce sara' pronto tra " + time + " minuti");
    }
}
