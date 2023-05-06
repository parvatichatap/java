package exceptionhandling;

public class Finally {
    static void prA()
    {
        try
        {
            System.out.println(" Inside prA");
            throw new RuntimeException("Demo");
        }
        finally
        {
            System.out.println(" PrA Finally ");
        }
    }
    static void prB()
    {
        try
        {
            System.out.println(" Inside Pr B");
            return;
        }
        finally {
            System.out.println(" Pr B Finally");
        }
    }
    static void prC()
    {
        try
        {
            System.out.println(" Inside prC ");
            return;
        }
        finally
        {
            System.out.println(" prC Finally");
        }
    }

    public static void main(String[] args) {
        try
        {
            prA();
        }catch (Exception e)
        {
            System.out.println("Exception caught");
        }
        prB();
        prC();
    }
}
