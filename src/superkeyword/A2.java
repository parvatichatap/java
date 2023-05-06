package superkeyword;

public class A2 {
    void eat(){
        System.out.println("eating");
    }
}
class D1 extends A2{
    void eat(){
        System.out.println("eating bread");
    }
    void bark(){
        System.out.println("barking");
    }
    void work(){
        super.eat();
        bark();
    }
}
class Use2{
    public static void main(String[] args) {
        D1 obj=new D1();
        obj.work();

}}
