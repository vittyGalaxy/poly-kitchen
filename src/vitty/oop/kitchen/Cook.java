package vitty.oop.kitchen;

public class Cook implements Runnable{
    private final QueueDishes queueDishes;
    private int level;
    private int delayMS;
    private Dish[] dishesToBePrepared;

    public Cook(int level, int delayMS, QueueDishes queueDishes){
        this.level = level;
        this.delayMS = delayMS;
        this.queueDishes = queueDishes;
    }

    public int getLevel(){
        return this.level;
    }

    public int getDelay(){
        return this.delayMS;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDelayMS(int delayMS){
        this.delayMS = delayMS;
    }

    // Methods
    public void prepareDishes(Dish[] dishesToBePrepared){
        this.dishesToBePrepared = dishesToBePrepared;
    }

    @Override
    public void run(){
        try {
            for(Dish dish : dishesToBePrepared){
                dish.prepare(delayMS);
                queueDishes.addDish(dish);
                Thread.sleep(delayMS);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}