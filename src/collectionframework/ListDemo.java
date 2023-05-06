package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * i
 * 2.list can store duplicate element.
 * 3.list can store any number of null value.
 * 4.list follow the insertion order.
 * 5.we can iteratr(get) the list element by iterator and list
 *
 */

public class ListDemo {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(0, 10);
        l.add(1, 20);
        l.add(30);
        l.add(40);
//        l.add(20);
//        l.add(10);
//        l.add(null);
//        l.add(null);
//       System.out.println(l);
//       Iterator itr= l.iterator();
//      while ( itr.hasNext()){
//          System.out.println(itr.next());
//      }
//
        ListIterator l1=l.listIterator();
//        while (l1.hasNext())
        {
            System.out.println(l1.next());
        }
    }

}
