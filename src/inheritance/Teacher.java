package inheritance;

public class Teacher {
    int id;
    String name;
    String address;

    public void show(){

    }
}

class MathsTeacher extends Teacher{
    public void show(){

    }
    public static void main(String[] args) {
        MathsTeacher obj = new MathsTeacher();
        obj.id = 13;
        obj.name = "parvati";
        obj.address = "Pune";
        System.out.println("id=>"+obj.id+" name=>"+obj.name+" address=>"+obj.address);
    }
}

class PhysicsTeacher extends MathsTeacher{
    public static void main(String[] args) {
        PhysicsTeacher obj = new PhysicsTeacher();
        obj.id = 12;
        obj.name = "paru";
        obj.address = "Pune";
        System.out.println("id=>"+obj.id+" name=>"+obj.name+" address=>"+obj.address);
    }
}

class ChemistryTeacher extends PhysicsTeacher{
    public static void main(String[] args) {
        ChemistryTeacher obj = new ChemistryTeacher();
        obj.id = 3;
        obj.name = "prithi";
        obj.address = "Pune";
        System.out.println("id=>"+obj.id+" name=>"+obj.name+" address=>"+obj.address);
    }
}