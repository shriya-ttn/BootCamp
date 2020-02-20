
class MultithreadingDemo implements Runnable
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            for(int i=1;i<8;i++){
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running "+ i);
            Thread.sleep(100);}

        }
        catch (Exception e)
        {
            // Throwing an exception 
            System.out.println ("Exception is caught");
        }
    }
}

// Main Class 
class Multithread
{
    public static void main(String[] args)
    {
        int n = 8; // Number of threads 
        for (int i=0; i<n; i++)
        {
            Thread object = new Thread(new MultithreadingDemo());
            Thread obj1 = new Thread(new MultithreadingDemo());
            object.start();

            obj1.start();
        }
    }
} 