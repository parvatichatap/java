package multithreading;

public class Test extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(" From thread Test: i=" + i);
        }
        System.out.println("Exit from Test");
    }
}

class A extends Thread {
    public void run() {
        for (int j = 1; j <= 4; j++) {
            System.out.println(" From thread A: j=" + j);
        }
        System.out.println("Exit from A");
    }
}
        class B extends Thread
{
    @Override
    public void run() {
        for(int k=1;k<=4;k++){
            System.out.println(" From thread B: k="+k);
        }
        System.out.println("Exit from B");

    }
}
class C extends Thread{
    public static void main(String[] args) {
        new Test().start();
        new A().start();
        new B().start();
    }
}
