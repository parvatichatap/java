package statickeyword;

public class Employee {
    int empId;
    String name;
    static String companyName = "ASD";// static variable

    static class In1 {
        int a = 100,b=50;

        public void pa() {
            System.out.println(" in inner class");
            System.out.println(a+b);
        }


    }

  static{
      System.out.println("in static block");// static block
      companyName="ASD";
  }
  public static void show(){
      System.out.println("in a static method ");
  }

    Employee(int empId,String name)
    {
        this.empId=empId;
        this.name=name;
    }
    public  void display(){
        System.out.println(empId +"  "+name+"  "+companyName);
        show();
    }

    public static void main(String[] args) {
        Employee e1=new Employee(1,"parvati");
        Employee e2=new Employee(2 ," rupa");
        e1.display();
        In1  i= new Employee.In1();
        i.pa();
    }

}
