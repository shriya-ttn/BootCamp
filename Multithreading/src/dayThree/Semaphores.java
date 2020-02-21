package dayThree;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Connection {

    private static Connection instance = new Connection();

    private Semaphore sem = new Semaphore(4, true);

    private int connections = 0;

    private Connection() {}

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {
            sem.acquire();
            System.out.println("Semaphore Acquire.." + Thread.currentThread().getName());
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        try {
            doConnect();
        } finally {

            sem.release();
            System.out.println("Semaphore Released" + Thread.currentThread().getName());
        }
    }

    public void doConnect() {

        synchronized (this) {
            connections++;
            System.out.println("Current connections: " + connections);
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            connections--;  }
    }
}


public class Semaphores {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i=0; i < 10; i++) {
            executor.submit(new Runnable() {
                public void run() {
                    Connection.getInstance().connect();
                }
            });
        }
      //  System.out.println("g");
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("Main command printed after semaphores");
    }
}
