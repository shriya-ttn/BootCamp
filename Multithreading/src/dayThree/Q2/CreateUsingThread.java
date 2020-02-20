package dayThree.Q2;

public class CreateUsingThread  extends Thread {
    public void run(){
        System.out.println("Run method executed by thread");
    }

    public static void main(String[] args) {
        CreateUsingThread t = new CreateUsingThread();
        t.start();
        System.out.println("Main method executed");

    }

}
