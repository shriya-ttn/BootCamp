package dayThree;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

class CountDownLatchExample {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Random random = new Random();

        WorkerThread wt1 = new WorkerThread(latch, random.nextInt(5000));
        WorkerThread wt2 = new WorkerThread(latch, random.nextInt(5000));
        WorkerThread wt3 = new WorkerThread(latch, random.nextInt(5000));

        new Thread(wt1, "WT-11").start();
        new Thread(wt2, "WT-22").start();
        new Thread(wt3, "WT-33").start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finally main is executed");
    }

}

class WorkerThread implements Runnable {

    private CountDownLatch latch;
    private int delay;

    public WorkerThread(CountDownLatch latch, int delay) {
        this.latch = latch;
        this.delay = delay;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        int delay = this.delay;

        System.out.println(name + " sleeping for " + delay + " milliseconds.");
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.latch.countDown();
        System.out.println(name + " finished");

    }

}