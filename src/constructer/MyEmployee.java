package constructer;

public class MyEmployee {
    private int id;
    private String name;

public MyEmployee() {
    id = 13;
   name = "your name is hear";
}
    public MyEmployee(String myName,int myId)
    {
        id=myId;
        name=myName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        MyEmployee obj=new MyEmployee();

        MyEmployee obj1=new MyEmployee("rohini thorat",12);

       System.out.println(obj1.getId());
       System.out.println(obj1.getName());
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
