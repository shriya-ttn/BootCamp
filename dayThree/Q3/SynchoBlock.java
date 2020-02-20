package dayThree.Q3;

class SynchoBlock {

    void printTable(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }//end of the method
}

class TestSynchronizedBlock2{
    public static void main(String args[]){
        final SynchoBlock obj = new SynchoBlock();//only one object

        Thread t1=new Thread(){
            public void run(){
                System.out.print("Th1 : ");
                obj.printTable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                System.out.print("Th2 : ");
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}