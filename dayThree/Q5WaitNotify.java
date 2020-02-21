package dayThree;

public class Q5WaitNotify {

        public static void main(String[] args){
            ThreadB b = new ThreadB();
            b.start();
        //   System.out.println("I am main");
            synchronized(b){

                try{
                    System.out.println("Waiting for b to complete...");
                   b.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                System.out.println("Total is: " + b.total);
            }
            System.out.println("I am main");
        }
    }

    class ThreadB extends Thread{
        int total;
        @Override
        public void run(){
            synchronized(this){
                for(int i=0; i<100 ; i++){
                    total += i;
                }
                notify();
            }
        }
    }
