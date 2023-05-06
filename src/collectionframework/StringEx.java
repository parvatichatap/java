package collectionframework;


import java.util.*;


public class StringEx  implements  Comparable<StringEx>  {
    int rollno, marks;
    String name;


    public StringEx(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;

    }


    public static void main(String[] args) {


        StringEx obj1 = new StringEx(23, "mahesh", 88);
        StringEx obj2 = new StringEx(25, "sony", 96);
        StringEx obj3 = new StringEx(26, "larry", 94);
        StringEx obj4 = new StringEx(28, "usha", 85);
        StringEx obj5= new StringEx(27,"ganu",100);
        List<StringEx> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        Collections.sort(list);
        list.forEach(s -> {
            System.out.println(s.marks + " " + s.name + " " + s.rollno);
        });
    }
    public int compareTo(StringEx o) {
        if (this.marks == o.marks) {
            return 0;
        } else if (this.marks < o.marks) {
            return 1;
        } else {
            return -1;
        }
    }

}

