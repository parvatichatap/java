//public static native  void sleep(long milli) throw interrupted
package multithreading;

public class SleepM {
    public static void main(String[] args) throws InterruptedException{
        for(int i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
class Sleep extends Thread
{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(i);
        }

    }


    public static void main(String[] args){
        Sleep s = new Sleep();
        s.start();
        }

    }

