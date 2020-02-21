package dayThree.Q2;

class Abc{
    public static void m1() {
        System.out.println("Hello");
    }
}
public class CreatedUsingRunnable extends Abc implements Runnable{
    public void run(){
        System.out.println("Run method executed");
    }

    public static void main(String[] args) {
        CreatedUsingRunnable t = new CreatedUsingRunnable();
        t.m1();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("Main method executed");

    }
}
