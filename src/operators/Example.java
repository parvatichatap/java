package operators;

public class Example {
    public static void main(String args[]) {
        //Arithmetic operator
        int a = 10;
        int b = 5;
        System.out.println(a - b);//sub
        System.out.println(a * b);//mul
        System.out.println(a / b);//divide
        System.out.println(a % b);//reminder
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
        // lift shift
        System.out.println(10 << 2);
        System.out.println(10 << 3);//
        System.out.println(20 << 2);//
        System.out.println(15 << 4);//
        //Right shift
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2




            a +=4;//a=a+4 (a=10+4)
            b -=4;//b=b-4 (b=5-4)
            System.out.println(a);
            System.out.println(b);
        }
    }

