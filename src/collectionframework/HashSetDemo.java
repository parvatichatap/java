package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Hashset .it is implement of set interface.   package java.util
 * 2.syntax:  class HashSet implement set,cloneabl
 * { constructor // methods}
 * 3. HashSet is underline data structure is "Hashtable".
 *  HashSet is backed ny map.
 * 4.Hash set is introduced "JDk 1.2 version.
 *
 * properties of HashSet.
 *Hashset does not store duplicate value.
 * Hashset is non synchronized data structor
 * Hashset does not allow the insertion order.
 */

public class HashSetDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add(10);
        al.add("abc");
        al.add(20);
        al.add(30);
        al.add(40);
        HashSet h=new HashSet<>(al);
        h.add(10);
        h.add(10);
        h.add(40);
        h.add(50);
        h.add(50);
        h.add(160);
        h.add("xx");
//        h.clear();
        System.out.println(h.contains(50));
//        h.remove("xx");
        System.out.println(h.size());
        System.out.println(h);
//       Iterator i= h.iterator();
//       while (i.hasNext())
//       {
//           System.out.println(i.next());
//       }

    }
}
