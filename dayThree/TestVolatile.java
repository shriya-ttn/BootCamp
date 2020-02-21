package dayThree;

public class TestVolatile extends Thread{
    //Without volatile the thread forever hangs and doesnt end.
   volatile boolean keepRunning = true;

    public void run(){
        long count = 0;
        while(keepRunning){
            count++;
        }
        System.out.println("Thread terminated "+ count);

    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile t = new TestVolatile();
        t.start();
        Thread.sleep(100);
        System.out.println("After sleeping in main");
        t.keepRunning = false;
        t.join();
        System.out.println("keepRunning "+ t.keepRunning);

    }

}
