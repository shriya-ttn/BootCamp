package dayThree.Q4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolOddEven {

    public static void main(String args[]) {
        Printer print = new Printer();

        ExecutorService executor = Executors.newCachedThreadPool();

        Thread t1 = new Thread(new TaskEvenOdd(print, 10, false));
        Thread t2 = new Thread(new TaskEvenOdd(print, 10, true));
//        t1.start();
//        t2.start();

        executor.submit(t1);
        executor.submit(t2);
    }

}

class TaskEvenOdd implements Runnable {

    private int max;
    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {

        //System.out.println("Run method");
        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {

            if (isEvenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
         //       System.out.println( Thread.currentThread().getName());
                print.printEven(number);
                //number+=2;
            } else {
              //  System.out.println( Thread.currentThread().getName());
                print.printOdd(number);
                // number+=2;
            }
            number += 2;
        }

    }

}

class Printer {

    boolean isOdd = false;

    synchronized void printEven(int number) {

        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+" Even: " + number);
        isOdd = false;
        notifyAll();

    }

    synchronized void printOdd(int number) {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() +" Odd: " + number);
        isOdd = true;
        notifyAll();
    }

}