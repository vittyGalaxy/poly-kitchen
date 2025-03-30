package vitty.oop.kitchen;

public class Cook extends Thread{
    private final String name;
    private int level;
    private Kitchen_Buffer kitchen;
    private String value;

    public Cook(String name, int level, Kitchen_Buffer kitchen, String value) {
        this.name = name;
        this.level = level;
        this.kitchen = kitchen;
        this.value = value;
    }

    public String get_Name() {
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

    // Override
    public void run(){
        while(true){
            try{
                kitchen.product(this.value);
                System.out.println(this.value + " produced");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                break;
            }
        }
    }
}