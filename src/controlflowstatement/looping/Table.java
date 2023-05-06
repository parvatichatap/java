package controlflowstatement.looping;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.println(num * i);
        }
        System.out.println();

// factorial number

        int fact = 1;
        for (int i = 1; i <= num; i++)// or for(int i=num;i>=1;i--)
        {
            fact = fact*i;
        }
            System.out.println( "factorial of " +num+ "is " +fact);
        //using recursion



        // Reverse  a number
       int no=3456,rem,rev=0;
        while(no  !=0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;

        }
        System.out.println("rev no= " +rev);


        //reverse String
        String name="parvati";
        int leng=name.length();
         String reverse=" ";
        for(int i=leng-1;i>=0;i--)
        {
            reverse=reverse+name.charAt(i);
        }
        System.out.println("reverse of  :"  +name+ " is" +reverse);

    }
}
