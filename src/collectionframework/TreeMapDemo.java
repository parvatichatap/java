package collectionframework;

import java.io.FilterOutputStream;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"pune");
        treeMap.put(2,"latur");
        treeMap.put(3,"janegaon");
        treeMap.put(4,"beed");
        treeMap.put(5,"kaij");
        System.out.println(treeMap);
        System.out.println(treeMap.subMap(2,4));
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.floorKey(6));
        System.out.println(treeMap.ceilingKey(6));
        System.out.println(treeMap.floorEntry(6));
        System.out.println(treeMap.ceilingKey(6));

    }
}
