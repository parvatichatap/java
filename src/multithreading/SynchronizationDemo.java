package multithreading;

public class SynchronizationDemo  {
    int num;
   synchronized public  void  increment()
    {
        num++;
    }

    public static void main(String[] args)throws InterruptedException {
        SynchronizationDemo obj = new SynchronizationDemo();
        // SynchronizationDemo obj1=new SynchronizationDemo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++)
                    obj.increment();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++)
                    obj.increment();
            }
        });
        t1.start();
        t2.start();


        t1.join();
        t2.join();
       System.out.println("num ="+obj.num);
    }
}
