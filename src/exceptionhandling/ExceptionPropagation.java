package exceptionhandling;

public class ExceptionPropagation {
    public void a()
    {
        int i=10;
    }
    public  void b()
    {
        a();
    }
    public void c()
    {
        try
        {
            b();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("hii");
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new  ExceptionPropagation();
        obj.c();

    }
}
