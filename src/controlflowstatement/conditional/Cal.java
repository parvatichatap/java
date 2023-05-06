  package controlflowstatement.conditional;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args)
    {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter first num");
            int num1 = s.nextInt();
            System.out.println("Enter second num");
            int num2 = s.nextInt();
            System.out.println("+,-,*,/");
            String sym = s.next();
            int res;
            switch (sym) {
                case "+":
                    res = num1 + num2;
                    System.out.println("Addition :" + res);
                    break;
                case "-":
                    res = num1 - num2;
                    System.out.println("sub:" + res);
                    break;
                case "*":
                    res = num1 * num2;
                    System.out.println("multiplication: " + res);
                    break;
                case "/":
                    res = num1 / num2;
                    System.out.println("divide" + res);
                    break;
                default:
                    System.out.println("Invalid symbol");
            }
            System.out.println ("Do u want to continue(Press y for Yes and n for No)");
            yn = s.next();
        }while(yn.equals("y")|| yn.equals("Y"));



    }
}
