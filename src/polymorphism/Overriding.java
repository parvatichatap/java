package polymorphism;

public class Overriding {
    void display()
    {
        System.out.println(" I am paru");
    }
}
class A extends Overriding{
    @Override
    void display() {
        System.out.println("hi paru");

    }

    public static void main(String[] args) {
        Overriding o1=new Overriding();
        o1.display();
        A a1=new A();
                a1.display();

    }
}
