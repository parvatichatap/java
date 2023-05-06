package java8;

/**
 * Lambda expressions introduced in java 8.
 * Lambda expressions is an anonymous function.its a function
 *
 */


interface  Shape{
    void draw();
}
class Rectangle{
    public void draw(){
        System.out.println(" rectangle draw method");
    }
}
public class LambdaExpr {
    public static void main(String[] args) {
        Shape rectangle= ()-> System.out.println("rectangle draw method");
rectangle.draw();

    }
}
