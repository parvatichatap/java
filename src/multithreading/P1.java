package multithreading;

class Prime extends Thread {


    public void run() {
        for (int i = 1; i <= 20; i++) {
            if ((i == 2) || (i == 3)) {
                System.out.println("Prime :" + i);
            } else if (!((i % 2 == 0) || (i % 3 == 0))) {
                System.out.println("Prime :" + i);
            }
        }

    }
}
class NonPrime extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if ((i == 2) || (i == 3)) {
                // System.out.println("Prime :" + i);
            } else if (((i % 2 == 0) || (i % 3 == 0))) {
                System.out.println("NonPrime :" + i);
            }
        }
    }
}

public class P1  {
    public static void main(String[] args) {
        Prime p = new Prime();
            NonPrime np =new NonPrime();
            p.start();
            np.start();


        }
    }

