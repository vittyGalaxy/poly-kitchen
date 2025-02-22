import vitty.oop.kitchen.*;

public class Client {

    public static void main(String[] args) {
        Cook cook = new Cook("Carlo Cracco", 2);
        Dish dish = new Pizza("Patapizza");
        cook.prepareDish(dish);
        cook.prepareDish(dish, 30);

        Dish gelato = new IceCream("Cioccolato", 1);
        cook.prepareDish(gelato);
        cook.prepareDish(gelato, 2);

        Dish cake = new Cake("Setteveli");
        cook.prepareDish(cake);
        cook.prepareDish(cake, 20);

        Dish pasta = new Pasta("Carbonara");
        cook.prepareDish(pasta);
        cook.prepareDish(pasta, 10);
    }
}