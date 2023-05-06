/**
 * constructor -> it is special type function
 *              which invoke automatically when you create
 *              object of class
 * Rules ->
 *  1.  class name and constructor name should be same
 *  2. there should not be explicit return type to constructor
 *  3. static, synchronized,final keywords are not allowed
 *
 *  types ->
 *  1. default
 *  2. parameter
 *
 *  use - initialize variables to their default value
 */
package constructer;

public class ConstructorDemo {
    int i;
    String name;
    public void show(){


    }
    public ConstructorDemo(){
        System.out.println("In default  Constructor");
    }
    public ConstructorDemo(int i,String s){
        System.out.println("in parameter constructor");
    }

    public static void main(String[] args) {
         ConstructorDemo obj=new ConstructorDemo();
         ConstructorDemo obj1=new ConstructorDemo(2,"rupa");
    }

}
