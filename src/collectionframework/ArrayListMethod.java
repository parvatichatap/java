package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
//        list1.add(10);


//        System.out.println(list1.get(1));
//       System.out.println(list1.contains(10));
//        System.out.println(list1.hashCode());
//       System.out.println(list1.indexOf(30));
//       System.out.println(list1.isEmpty());
//      System.out.println(list1.subList(1,4));

//        list1.clear();
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);


        String str = "Pune";
        System.out.println(str.hashCode());
        list1.addAll(list2);
//      list1.removeAll(list2);
//      list1.retainAll(list2);
        System.out.println(list1);

        System.out.println(list1.containsAll(list2));
        System.out.println(list1.equals(list2));

        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);

        System.out.println(list);

       List<Object> list3 = new ArrayList<Object>();
        list3.add("Pune");
        list3.add(9);
        list3.add(false);

        System.out.println();

    }
}

//1,2,3,4,5 -list1
//1,2,3,4,5 -list2




