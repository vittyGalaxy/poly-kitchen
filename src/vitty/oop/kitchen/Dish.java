package vitty.oop.kitchen;

public class Dish {
    protected String name;
    protected int nIngredient;
    protected Ingredient[] ingredient;

    // Builder
    public Dish(String name) {
        this.name = name;
        this.ingredient  = new Ingredient[nIngredient];
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getnIngredient() {
        return nIngredient;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setnIngredient(int nIngredient) {
        this.nIngredient = nIngredient;
    }

    // Methods
    public void prepare(){}

    public void prepare(int time){}

    public void addIngredient(Ingredient ingredient){
        nIngredient++;
        this.ingredient[nIngredient] = ingredient;
    }
}
