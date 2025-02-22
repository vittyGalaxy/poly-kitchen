package vitty.oop.kitchen;

public class Cook {
    private final String name;
    private int level;

    public Cook(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Methods
    public void prepareDish(Dish dish){
        dish.prepare();
    }

    public void prepareDish(Dish dish, int time){
        dish.prepare(time);
    }
}
