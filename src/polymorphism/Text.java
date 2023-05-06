package polymorphism;

public class Text {
    void show( String s)
    {
        System.out.println("in show");
    }
    void show(int a)
    {
        System.out.println("in show paru");
    }

    public static void main(String[] args) {
        Text t1=new Text();
        t1.show(3);
        t1.show("p");
    }
}
