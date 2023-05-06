package exceptionhandling;

public class TryInner {
    public static void main(String[] args) {
        try
        {
            System.out.println(" In outer try block");
            int b=10;
            int a=50/b;
            System.out.println(a);
            try
            {
                System.out.println(" In inner try block");
                int x[]=new int [5];
                x[5]=10;
            }catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.println("Program flow continue...");
            }
        }catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Program flow continue...");
        }
    }
}

