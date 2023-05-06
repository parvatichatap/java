package multithreading;
import java.lang.InterruptedException;
public class Mt1Demo  {
     public static void main(String[] args)  throws InterruptedException{
     Thread t1 = new Thread(new Runnable() {
    @Override public void run() {
    for (int i = 1; i <= 5; i++) {
    System.out.println("hii");
        try
        {
            Thread.sleep(500);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

    }
    });

     Thread t2 = new Thread  (()-> {
         for (int i = 1; i <= 5; i++) {
             System.out.println("hello");
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     });
     t1.start();
     t2.start();

     t1.join();
     t2.join();
         System.out.println("Exit");
     }


     class Hii extends  Thread{
    @Override public void run()
    {
    for (int i = 1; i <= 5; i++) {
    System.out.println("hello");
        try
        {
            Thread.sleep(500);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

    }
    }
    }
     class Hello implements Runnable{
    @Override public void run()
    {
    for (int i = 1; i <= 5; i++) {
    System.out.println("hii");
    try
    {
        Thread.sleep(500);
    }catch (InterruptedException e)
    {
        throw new RuntimeException(e);
    }
    }
    }
    }
}

