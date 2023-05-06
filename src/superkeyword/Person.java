/** using thiskeyword and super keyword
 */
package superkeyword;

public class Person {
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Emp extends Person{
    float salary;
    Emp(int id,String name,float salary){
        super(id,name);
        this.salary=salary;
    }
    void display(){
        System.out.println(id+"" +name+"" +salary);
    }
}
class St{
    public static void main(String[] args) {
        Emp e1=new Emp(122,"rohini",4500000f);
        e1.display();
    }
}
