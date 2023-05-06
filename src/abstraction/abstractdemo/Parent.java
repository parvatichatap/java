package abstraction.abstractdemo;

abstract class Parent {
    public Parent()
    {
        System.out.println("abstract  class ,constructor");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greed();
}
class Child extends Parent{
    public void greed()
    {
        System.out.println("good morning");
    }

}
abstract  class child2 extends Parent {
    public void pa() {
        System.out.println("i am good ");
    }


    public static void main(String[] args) {
        child2 obj = new child2() {
            @Override
          public void greed() {

            }
        };
        obj.sayHello();
        obj.pa();
        Child obj1= new Child();
        obj1.greed();



        
    }
}