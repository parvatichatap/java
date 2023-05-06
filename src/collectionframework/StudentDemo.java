package collectionframework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StudentDemo {
    int id;
    String name;
    String address;
//    public StudentDemo()


    public StudentDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDemo that = (StudentDemo) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {
        StudentDemo s4 = new StudentDemo(1, "sss", "bbb");
        StudentDemo s1 = new StudentDemo(1, "sss", "bbb");
        StudentDemo s3 = new StudentDemo(2, "asd", "pune");
//        Set<StudentDemo> set=HashSet<>();
        Set<StudentDemo> set = new HashSet<>();
        set.add(s4);
        set.add(s1);
        set.add(s3);

set.forEach(s -> {
    System.out.println(s.id +" "+s.name+" "+ s.address);
});
    }
}
