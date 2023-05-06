package collectionframework;

import java.util.*;

/** Map: 1.map is  interface which is present in java.util package.
 *    map does not inherit collection interface.
 * 2.syntax: public interface Map {//methods}
 * 3.map is introduced JDk 1.2 version.
 *4. map properties.....
 * 1.map stores the data in key-value pair.
 * ex.. name-roll-no
 *       phone-no-name
 *       emo id-name
 * 2.in map keys should be unique but value can be duplicate.
 * 3.in map we can store max one null value in key. but in value we can store any null value.
 * 4.map does not follow sorting and insertion order.
 *
 */

public class MapDemo {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Nashik");

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(1,"Pune");
        map1.put(2,"Mumbai");
        map1.put(3,"Nashik");

        Map<Integer,String> map2 = new HashMap<>();

        map2.put(1,"Pune");
        map2.put(2,"Mumbai");
        map2.put(3,"Nashik");

        List<Map<Integer,String>> list = Arrays.asList(map1,map,map2);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println("Key->"+k +" Value->"+v);
            });
        });

//        System.out.println(map);
//
//        map.forEach((k,v)->{
//            System.out.println("Key->"+k +" Value->"+v);
//        });
//
//        for(Map.Entry<Integer,String> m:map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
    }

}
