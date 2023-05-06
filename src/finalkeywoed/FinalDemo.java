

package finalkeywoed;


public class FinalDemo {
    final int TEST=10;


class A {

}
    public void display() {

        System.out.println(TEST);

    }

    public static void main(String[] args) {
        FinalDemo obj=new FinalDemo();
        obj.display();
        System.out.println(obj.TEST);


    }
}
class c extends FinalDemo{
    @Override
    public void display() {
        super.display();
    }
}

