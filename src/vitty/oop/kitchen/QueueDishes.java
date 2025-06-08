package vitty.oop.kitchen;

public class QueueDishes{
    private final Dish[] dishes;
    private int numDishesInBuffer;
    private int inPosition;
    private int outPosition;

    public QueueDishes(int numDishes){
        if (numDishes > 0){
            dishes = new Dish[numDishes];
        }else{
            dishes = new Dish[1];
        }

        numDishesInBuffer   = 0;
        inPosition          = 0;
        outPosition         = 0;
    }

    public synchronized void addDish(Dish dish) throws InterruptedException{
        // verify if is full
        while(numDishesInBuffer == dishes.length){
            wait();
        }

        // not full
        dishes[inPosition] = dish;
        numDishesInBuffer++;
        inPosition = (inPosition + 1) % dishes.length;
        notifyAll();
    }

    public synchronized Dish removeDish() throws InterruptedException {
        while (numDishesInBuffer == 0){
            wait();
        }

        Dish dishRequested = dishes[outPosition];
        outPosition = (outPosition +1) % dishes.length;
        numDishesInBuffer--;
        notifyAll();
        return dishRequested;
    }

}
