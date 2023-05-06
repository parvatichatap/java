package controlflowstatement.conditional;

import java.util.Scanner;

//leap year
public class LeapYear {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner s= new Scanner(System.in);
            System.out.println("Enter any year you want :");
            int year=s.nextInt();

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("leap year");
            } else {
                System.out.println("not leap year");
            }
            System.out.println ("Do u want to continue(Press y for Yes and n for No)");
            yn = s.next();
        }while(yn.equals("y")|| yn.equals("Y"));



    }
}

