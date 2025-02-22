package vitty.oop.kitchen;

public class Cook {
    private String name;
    private int level;

    public Cook(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Methods
    public void prepareDish(Dish dish){
        System.out.println("Sto preparando " + dish.getName());
    }

    public void prepareDish(Dish dish, int time){
        System.out.println("Sto preparando "+  dish.getName() + " e ci mettero' " + time + " minuti");
    }
}
