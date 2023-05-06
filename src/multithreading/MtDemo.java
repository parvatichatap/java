package multithreading;

public class MtDemo {
    public static void main(String[] args)  {


        System.out.println("in main method");
        //System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("paru");
        System.out.println( Thread.currentThread().getName());
        //Thread t=new Thread();
        try {
            System.out.println(10 / 0);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        Hii h=new Hii();
        h.start();

        Hello h1 = new Hello();
        Thread t1 = new Thread(h1);
        t1.start();

    }
}

class Hii extends  Thread {
    @Override
    public void run() {
         System.out.println( Thread .currentThread().getName());
        System.out.println(" in run method");

    }
}
class Hello implements  Runnable
{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("In implement runnable method");

    }
}

