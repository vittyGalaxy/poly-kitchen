package vitty.oop.kitchen;

public class Consumer_Clients extends Thread{
    private Kitchen_Buffer kitchen;

    Consumer_Clients(Kitchen_Buffer kitchen){
        this.kitchen = kitchen;
    }

    public void run(){
        while(true){
            try{
                String value = kitchen.consume();
                System.out.println(value + " consumed");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                break;
            }
        }
    }
}
