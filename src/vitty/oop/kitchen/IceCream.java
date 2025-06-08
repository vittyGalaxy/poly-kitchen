package vitty.oop.kitchen;

public class IceCream extends Dessert{
    private int numFlavor;

    // Builder
    public IceCream(String name, int numFlavor) {
        super(name);
        this.numFlavor = numFlavor;
    }
    
    // Getter
    public int getNumFlavor() {
        return this.numFlavor;
    }

    // Setter
    public void setNumFlavor(int numFlavor) {
        this.numFlavor = numFlavor;
    }

    // Methods

    @Override
    public void prepare() {
        System.out.println("We are making " + name);
    }

    @Override
    public void prepare(int time){
        System.out.println( name + " will be ready in " + time + " minutes");
    }
}