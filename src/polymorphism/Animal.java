package polymorphism;

public class Animal {
    public void sound()
    {
        System.out.println("in animal sound");
    }
}
class Cat extends Animal{

    public void sound() {
        System.out.println("in cat sound");
    }

    public static void main(String[] args) {
        Cat obj =new Cat();
        obj.sound();
        Animal obj2= new Animal();
        obj2.sound();
    }
}