package controlflowstatement.looping;

public class Swap {
    public static void main(String[] args) {

        //withouting using third variable
        int a=10,b=20;
       a=a+b;
       b=a-b;
       a=a-b;

        System.out.println("a:"+a);
        System.out.println("b:"+b);



        int c=12,d=16;
        int t;
        t=c;
        c=d;
        d=t;

        System.out.println("c:"+c);
        System.out.println(" d :"+d);
    }
}
