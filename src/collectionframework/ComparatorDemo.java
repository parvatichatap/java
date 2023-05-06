package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    int id;
    String name,address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        ComparatorDemo obj4=new ComparatorDemo(53 , " tam " , " pargaon ");
ComparatorDemo obj1=new ComparatorDemo(26 ," sir "," latur ");
ComparatorDemo obj2=new ComparatorDemo(26 ," Pranav " , " beed ");
ComparatorDemo obj3=new ComparatorDemo(53 ," Amit " ," pune ");

        List<ComparatorDemo>list=new ArrayList<ComparatorDemo>();
          list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        Comparator<ComparatorDemo>comparator=new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                if(o1.id== o2.id) {
                    return 0;
                } else if (o1.id > o2.id) {
                    return 1;
                }else {
                    return  -1;
                }
            }
        };
        Comparator<ComparatorDemo>comparator1=new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        Collections.sort(list,comparator.thenComparing(comparator1));
        list.forEach(s->{
            System.out.println(s.id+""+s.name+s.address);
        });
    }
}
