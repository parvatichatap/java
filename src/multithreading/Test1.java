package multithreading;

public class Test1  implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread Test1 :" + i);
        }
        System.out.println("End of Thread Test");
    }
}

    class RunnableTest {

        public static void main(String[] args) {
            Test1 t1 = new Test1();
            Thread th = new Thread(t1);
            th.start();
            System.out.println("End of main thread");
        }
    }

