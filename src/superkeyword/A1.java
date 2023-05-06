/** super can be used to refer immediate parent class instance variable.
 * super can be used to call immediate parent class method.
 * super can be used to call immediate parent class constructor.
 */
package superkeyword;

public class A1 {
    String color = "white";
}

class Dog extends A1{
    String color="black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

}
class Use1{
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.printColor();
    }
}
