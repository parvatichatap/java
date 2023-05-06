package collectionframework;

import java.util.*;

public class Em  implements Comparable<Em> {
    int id;
    String name;
    String address;
    int sallary;

    public Em(int id, String name, String address,int sallary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sallary=sallary;
    }

    public static void main(String[] args) {

        Em obj1 = new Em(102, "ovi", "Pune",5000);
        Em obj2 = new Em(56, "Amit", "Pune",4000);
        Em obj3 = new Em(98, "Shree", "Pune",7000);
        Em obj4=new Em(112,"ram","pargaon",4000);

        List<Em> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        Collections.sort(list);

        list.forEach(s -> {
            System.out.println(s.id + " " + s.name + " " + s.address + " "+s.sallary) ;
        });
    }

    public int compareTo(Em o) {
        if (this.id == o.id) {
            return 0;
        } else if (this.id > o.id) {
            return 1;
        } else {
            return -1;
        }
    }


}






