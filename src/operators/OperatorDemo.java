/**
 * arithmetic - +, -, /, *, %
 * assignment -  = ==
 * logical - && || !
 * bitwise - & |
 * unary operator - ++,--
 * relational - < > ,<= ,>=
 * shift - << >>
 * ternary - ? :
 */




package operators;

public class OperatorDemo {
    public static void main(String[] args) {
        System.out.println(" Arthmetic operators");
        int a=8;
                                                              //2. Assigment operators
        int b=6;
        b*=3;
         a=a+b;
        a-=45;
        System.out.println(a);
       System.out.println(b);
                                                               //comparision operators
        System.out.println(64<6);
                                                                //3. Logical operators
        System.out.println(64>5 || 64>98);
       System.out.println(56>6 && 56>9);
                                                                 //4. Bitwise oprators
        System.out.println();
                                                                   //unary operator

    }
}

