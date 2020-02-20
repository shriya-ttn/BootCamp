class ThreadSleep extends Thread{
    public void run(){
        for(int i=1;i<8;i++){
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Hello "+i);
        }
    }
    public static void main(String args[]){
        ThreadSleep t1=new ThreadSleep();
        ThreadSleep t2=new ThreadSleep();

        t1.start();
        t2.start();
    }
}  