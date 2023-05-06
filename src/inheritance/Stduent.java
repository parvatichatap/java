package inheritance;

public class Stduent {

    int id;
    int marks;
    String name;

}
class MathStudent extends Stduent {
    public void main()
    {

    }

}
class HindiStudent extends MathStudent{
    @Override
    public void main() {

    }

}
class MarathiStudent extends MathStudent{

    public void main() {

    }

    public static void main(String[] args) {
        MathStudent s1=new MathStudent();

       s1. id=13;
        s1.marks=91;
       s1. name="parvati";
        System.out.println("id:- "+s1.id + "marks:- "+s1.marks + "name:- " +s1.name);

        HindiStudent h1=new HindiStudent();
        h1.id=123;
       h1. marks=91;
        h1.name="paru";
        System.out.println("id:- "+h1.id + "marks:- "+h1.marks + "name:- " +h1.name);


        MarathiStudent m1=new MarathiStudent();

       m1. id=131;
       m1. marks=61;
        m1.name="prtibha";
        System.out.println("id:- "+m1.id + "marks:- "+m1.marks + "name:- " +m1.name);

    }
}