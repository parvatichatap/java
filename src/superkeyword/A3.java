package superkeyword;

public class A3 {
    A3(){
        System.out.println("animal is created");
    }
}
class D2 extends A3{
    D2(){
        super();
        System.out.println("dog is created");
    }
}
class Use3{
    public static void main(String[] args) {
        D2 obj= new D2();

    }
}