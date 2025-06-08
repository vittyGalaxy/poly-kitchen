package vitty.oop.kitchen;

public class Client implements Runnable{
    private final QueueDishes queueDishes;
    private int delayMS;
    private String name;
    private int numDishesToEat;

    public Client(String name, int delayMS, QueueDishes queueDishes){
        this.name = name;
        this.delayMS = delayMS;
        this.queueDishes = queueDishes;
        this.numDishesToEat = 0;
    }

    public String getName(){
        return this.name;
    }   

    public void setNumDishesToEat(int numDishesToEat){
        this.numDishesToEat = numDishesToEat;
    }

    @Override
    public void run(){
        try{   
            for(int i=0; i<numDishesToEat; i++){
                Dish dishOrdered = queueDishes.removeDish();
                System.out.println(this.getName() + " are eating " + dishOrdered.getName());
                Thread.sleep(delayMS);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted exception");
        }    
    }
}