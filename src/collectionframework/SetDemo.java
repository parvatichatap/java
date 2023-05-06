package collectionframework;

import java.util.*;

/** set.....
 * 1.set is not in index based datas .it is stores the data according  to hashcode value.
 * 2. set does not allow to store duplicate element.
 * 3.set can store only one null value.
 * 4.set does not follow the insertion order.
 * 5.we can iterate the set element by iterator
 */

public class SetDemo {
    public static void main(String[] args) {
        Set <Integer> s= new HashSet<>();
        s.add( 100);
        s.add(200);
        s.add(300);
        s.add(400);
       s.add(100);
        s.add(300);
        s.add(null);
        s.add(null);
//        System.out.println(s);
      Iterator itr= s.iterator();
      while (itr.hasNext()){
          System.out.println(itr.next());
      }


////Set<Integer>s1=new LinkedHashSet<>();
//      s1.add(10);
//      s1.add(20);
//      s1.add(30);
//      s1.add(40);
//      s1.add(50);
//        System.out.println(s1);
//        System.out.println();
//
//        Set<Integer> s2=new TreeSet<>();
//        s2.add(40);
//        s2.add(20);
//        s2.add(70);
//        s2.add(60);
//        s2.add(50);
//        System.out.println(s2);
//        System.out.println();
    }
}
