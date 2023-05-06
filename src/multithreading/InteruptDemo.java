package multithreading;

public class InteruptDemo {
    public static void main(String[] args) {
        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e)
                {
                    throw  new RuntimeException();
                }
                for(int i=1; i<=5;i++)
                {
                    System.out.println("In main Thread");
                }
            }
        });
        t1.start();
        t1.interrupt();
        System.out.println(t1.isInterrupted());
        System.out.println("In main thread");

    }
}
