package exceptionhandling;

public class TryCatch {



        /*int a = 100, b = 5, c = 5, x, y;
        try {
            x = a / (b - c);
            System.out.println(" Rest of the code");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        } finally {


            y = a / (b + c);
            System.out.println("y= " + y);
            System.out.println(" in finally block" );
        }*/
        public int[] arr=new int[10];
        public void writeList(){
            try
            {
                arr [10]=5;
                System.out.println(" rest of code");
            }catch (NumberFormatException e1)
            {
                System.out.println("NumberFormatException"+e1.getMessage());
            }catch(IndexOutOfBoundsException e2)
            {
                System.out.println("IndexOutOfBoundException "+e2.getMessage());
            }
        }
}
class p2
{
    public static void main(String[] args) {
        TryCatch t=new TryCatch();
        t.writeList();
    }
}
