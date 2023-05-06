package collectionframework;

import java.util.TreeSet;

/**Treeset.
 * Tree set is direct implement class of navigable set but indirectly implement
 * syntax: class TreeSet implement  navigableSet{//con  //methods}
 * TreeSet was introduced 1.2 version.
 * Tree set underline dta structure is blanced tree.
 * properties ....
 * 1. TreeSet is not index based DS.
 * 2.TreeSet is does not follow the insertion order.
 * 3.TreeSet allow sorting order.
 * 4.TreeSet store same  data type.
 * 5.it can not store duplicate element.
 * 6. non synchronized data type.
 * 7.null value can not be inserted in tree set.
 */

public class TreeSetDemo
{
    public static void main(String[] args) {
        TreeSet<Integer>treeSet=new TreeSet<>();
        treeSet.add(10);
        treeSet.add(12);
        treeSet.add(13);
        treeSet.add(14);
        treeSet.add(15);
//        System.out.println( " treelist"+treeSet);
//        System.out.println(treeSet.subSet(20,50));
//        System.out.println(treeSet.descendingSet());
//        System.out.println(treeSet.ceiling(10));
//        System.out.println(treeSet.floor(20));
//        System.out.println(treeSet.higher(11));
//        System.out.println(treeSet.lower(11));
        System.out.println(treeSet.headSet(12,true));
        System.out.println(treeSet.tailSet(11,true));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

    }
}
