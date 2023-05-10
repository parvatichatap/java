package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] args) {
        // q)create a list and filter all even number from list
       List <Integer> list1 =List.of(2,4,50,22,13,14,56);
List<Integer>list2=new ArrayList<>();
list2.add(91);
list2.add(92);
list2.add(93);
list2.add(94);

List<Integer> list = Arrays.asList(1,2,3,4,5);
//        System.out.println(list1);

//        list1 without stream
        List<Integer>listEven=new ArrayList<>();
        for (Integer i:list1)
        {
            if(i % 2==0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

//        using stream API
//        Stream<Integer> stream=list1.stream();
//       List<Integer>newList= stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(newList);

       List<Integer>newList= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList );

        List<Integer>newList1=list1.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println(newList1);




    }
}
