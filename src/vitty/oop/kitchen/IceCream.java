package vitty.oop.kitchen;

public class IceCream extends Dessert {
    private int numFlavor;
    // Builder
    public IceCream(String name, int numFlavor) {
        super(name);
        setNumFlavor(numFlavor);
    }

    // Getter
    public int getNumFlavor() {
        return numFlavor;
    }

    // Setter
    public void setNumFlavor(int numFlavor) {
        this.numFlavor = numFlavor;
    }

    // Methods

    @Override
    public void prepare() {
        System.out.println("We are making ice cream");
    }

    @Override
    public void prepare(int time) {
        System.out.println("The ice cream will be ready in " + time + " minutes");
    }
}
