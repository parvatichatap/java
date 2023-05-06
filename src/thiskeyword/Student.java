package thiskeyword;

public class Student {
    int rollno;
    String name;
    float fee;
  public Student(int rollno,String name,float fee){

       this.rollno=rollno;
     this.name=name;
      this.fee=fee;
   }
 public  Student(){
      this(11,"ganu",25000);
      show();

       System.out.println(" no parameter ");

   }
    void show(){
    this.display();
    }
    void display() {
        System.out.println("rollno:-" +rollno+"\n name:-"+name+"\n fee:-"+fee);
    }
    void p1(Student pd){
       System.out.println("i am current in p1 method");
    }
    void p2(){
      p1(this);
      Test2 t=new Test2(this);
    }
}
class Test2{
    Test2(Student pi){
        System.out.println("test class constructor");
    }
}

class This1{
    public static void main(String[] args) {
        Student s1=new Student(12,"parvati",35000f);
        Student s2=new Student(12,"paru",40000f);
        Student s3=new Student();
s1.show();
s3.p2();




    }
}


