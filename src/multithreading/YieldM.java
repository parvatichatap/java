package multithreading;

public class YieldM{
    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.yield();
                for(int i=1;i<=5;i++){
                    System.out.println("In thread 1");
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=1;i<=5;i++){
                    System.out.println("In thread 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
    }
/**class join extends Thread{
    public  void run()
    {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("child thread:" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)  throws  InterruptedException{
        join j=new join();
        j.start();
        j.join();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("main  thread:" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }**/

