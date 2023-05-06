package multithreading;
//case 1 performing single task from single thread
public class Ex1 extends Thread {
    public void run()
    {
if(Thread.currentThread().isDaemon())
{
    System.out.println(" daemon thread 1");
}
else {
    System.out.println(" child thread");
}
    }


    public static void main(String[] args) {
       System.out.println(" main thread");
        Ex1 e=new Ex1();
        e.setDaemon(true);
        e.start();

    }
}
//case 2performing single task  from multiple thread
 class Ex2 extends Thread{
    public void run()
        {
            System.out.println(" Task 2");
        }

    public static void main(String[] args) {
        Ex2 e1=new Ex2();
        e1.run();

        Ex2 e2=new Ex2();
        e2.start();
        Ex2 e3=new Ex2();
        e3.start();

        Ex2 e4=new Ex2();
        e4.start();
    }
        }
        //case 4: performing multiple task from multiple Thread
class MyThreadE3 extends Thread {
            @Override

            public void run() {
                System.out.println(" Multithreading ");
            }
        }
            class MyThreadE4 extends Thread {
                @Override

                public void run() {
                    System.out.println("vedio playing");
                }
            }
            class MyThreadE5 extends Thread {
                @Override

                public void run() {
                    System.out.println("Task is peocessing ");
                }
            }
class MyThreadE6  {
    public static void main(String[] args) {
        MyThreadE3 e3=new MyThreadE3();
e3.start();
        MyThreadE4 e4=new MyThreadE4();
        e4.start();
        MyThreadE5 e5=new MyThreadE5();
        e5.start();

    }
}
