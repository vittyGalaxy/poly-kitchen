package vitty.oop.kitchen;

public class Cake extends Dessert {
    //Builder
    public Cake(String name) {
        super(name);
    }
     // Methods
    @Override
    public void prepare() {
        System.out.println("Stiamo preparando la torta");
    }

    @Override
    public void prepare(int time) {
        System.out.println("La torta sara' pronta tra " + time + " minuti");
    }
}
