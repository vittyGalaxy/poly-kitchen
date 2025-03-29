package vitty.oop.kitchen;

import java.util.concurrent.Semaphore;

public class Kitchen_Buffer {
    private Semaphore semFull;
    private Semaphore semEmpty;
    private String value;

    public Kitchen_Buffer() {
        this.semFull = new Semaphore(0);
        this.semEmpty = new Semaphore(1);
        this.value = "";
    }

    public String consume() throws InterruptedException{
        semFull.acquire();
        System.out.println("consumed: " + this.value);
        semEmpty.release();
        return this.value;
    }

    public void product(String value) throws InterruptedException{
        semEmpty.acquire();
        this.value = value;
        System.out.println("produced: " + this.value);
        semFull.release();
    }
}
