package constructer;

import java.util.concurrent.Callable;

public class Cube1 {
    int length;
    int breath;
    int heigth;

    public int getVolume()
    {
        return (length * breath * heigth);
    }
    Cube1()
    {
       length=10;
       breath=10;
       heigth=10;
    }
    Cube1(int l,int b,int h) {
        length = l;
        breath = b;
        heigth = h;
    }

    public static void main(String[] args) {
        Cube1 obj=new Cube1();

        Cube1 obj1=new Cube1(10,20,30);
        System.out.println("volume of cube is:"+obj.getVolume());
        System.out.println("volume of cube is:"+obj1.getVolume());


    }
}
