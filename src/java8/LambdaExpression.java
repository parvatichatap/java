package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 1. it reduce the code.
 * 2.it is used to implement functional interface
 */
public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.forEach(s -> System.out.println(s));

        MyInterface myInterface = ()-> {
            System.out.println("hello");
        };
        myInterface.msg();
    }
}
@FunctionalInterface
interface MyInterface{
    void msg();
}
