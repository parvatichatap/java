package collectionframework;
/**
 * jdk 1.2 version: in this version collection framework is introduced.
 * vector is a legacy class.
 * vector is  implemented class of list  interface. which is present in java util class.
 * syntax: package : java.util;
 * class vector implements List{
 *    //constructor
 *    //methods
 * }
 * the underline Ds of vector is growable array or resizeable array.
 * properties of vector:
 * 1. vector is index base Ds.
 * 2.vector can store different data type(hetrogeneous).
 * 3.we can store duplicate element.
 * 4.we can store multiple null value.
 * 5.vector follow the insertion order.
 * 6.vector does not follow sorting order.
 * 7.vector are synchronized collection
 */
/** method
 *1. it contains List & collection  interface methods.
 * 2.add element()
 * 3.first element()
 * 4.last element()
 * 5.remove element()
 * 6.remove elementAt()
 * 7.removeAll element()
 * 8.capacity()
 *
 */

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
//        Vector<Integer> v=new Vector<>();
//       v.add(10);
//       v.add(30);
//       v.add(20);
//        v.add(40);
//        v.add(50);
//       System.out.println(v);
//        System.out.println(v.capacity());
        Vector v=new Vector();          // capacity 10
        v.add("paru");
        v.add(1,"pune");
        v.addElement("abc");
        v.add(100);
        v.add(120.4);
        v.add('g');

        v.setElementAt("bb",2);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.removeElement("abc"));
//        System.out.println(v.removeAll(v));
        v.removeElementAt(0);
        System.out.println(v);



  }
}
