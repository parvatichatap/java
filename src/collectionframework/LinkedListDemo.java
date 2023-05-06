package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(String[] args) {
//        ArrayList al=new ArrayList<>();
//        al.add(100);
//        al.add(200);
//        al.add(300);
        LinkedList l1=new LinkedList<>();
l1.add(10);
l1.add(20);
        l1.add(30);
        l1.add(40);

        System.out.println(l1);

        l1.addFirst("aaa");
        l1.addLast("bbb");

        l1.offer(60);

     l1.removeFirst();
      l1.removeLast();


        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());


    }
}
