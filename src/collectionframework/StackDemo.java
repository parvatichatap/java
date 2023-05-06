package collectionframework;

import java.util.Stack;

/**
 * stack is the legacy class. introduced in JDK 1.0 version.
 * stack is in the child class of the vector class. present in java.util package.
 * syntax: class Stack extends Vector{
 *     //constructor
 *     //method
 * }-,
 *.properties:
 * 1.
 *
 */

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>() ;
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.search(30));
        System.out.println(s.capacity());



    }
}
