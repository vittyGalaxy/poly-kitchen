import vitty.oop.kitchen.*;

public class Main {
    public static void main(String[] args) {
        // consts
        int cookLevel = 2;
        int delayForCook = 200;
        int delayForClient = 200;

        // OBJ
        QueueDishes oQD = new QueueDishes(5);
        Cook cook = new Cook(cookLevel, delayForCook, oQD);
        Client clientGiancarlo = new Client("Giancarlo", delayForClient, oQD);
        Client clientLuigi = new Client("Luigi", delayForClient, oQD);

        clientLuigi.setNumDishesToEat(3);
        clientGiancarlo.setNumDishesToEat(1);

        // Dishes
        Dish[] dishes = new Dish[4];
        dishes[0] = new Pizza("Patapizza");
        dishes[1] = new Cake("Setteveli");
        dishes[2] = new Pasta("Tonno");
        dishes[3] = new IceCream("Chcolate", 1);
        cook.prepareDishes(dishes);
        
        // Concurrancy
        Thread producerCook = new Thread(cook);
        Thread consumer1Client = new Thread(clientGiancarlo);
        Thread consumer2Client = new Thread(clientLuigi);

        producerCook.start();
        consumer1Client.start();
        consumer2Client.start();
    }
}
