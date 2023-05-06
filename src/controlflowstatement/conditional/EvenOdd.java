package controlflowstatement.conditional;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

String yn;

do{
    Scanner s = new Scanner(System.in);

    System.out.println("Enter any number ");
    int num = s.nextInt();
            if (num % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");
            }
    System.out.println("do yo want to continue (Press y for Yes and n for No ) ");
            yn = s.next();
        }while(yn.equals("y")|| yn.equals("Y"));
    }
}
