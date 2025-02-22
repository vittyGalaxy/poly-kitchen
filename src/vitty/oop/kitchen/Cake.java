package vitty.oop.kitchen;

public class Cake extends Dessert {
    //Builder
    public Cake(String name) {
        super(name);
    }
     // Methods
    @Override
    public void prepare() {
        System.out.println("We are preparing the cake");
    }

    @Override
    public void prepare(int time) {
        System.out.println("The cake will be ready in " + time + " minutes");
    }
}
