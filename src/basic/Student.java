package basic;

public class Student {
    int RollNo;
    String name;
    void show(int i,String s)
    {
        RollNo=i;
        name=s;
    }
    void put()
    {
        System.out.println("name:-"+name);
        System.out.println("RollNo:-"+RollNo);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.show(13,"parvati");
        s1.put();

    }
}
