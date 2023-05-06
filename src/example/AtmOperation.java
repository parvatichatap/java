package example;
import java.util.Scanner;
public class AtmOperation {
    public static void main(String[] args) {
        int balance = 500, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while (true)


        {
            System.out.println(" Automated teller machine");
            System.out.println("Enter 1 for Withdraw ");

            System.out.println("Enter 2 for Deposit");

            System.out.println("Enter 3 for  Check Balance");

            System.out.println("Enter 4 for Exit");
            System.out.println("select u want to perform operation:  ");


            int n = s.nextInt();


            switch (n)
            {
                case 1:
                    System.out.println(" Enter money for withdrawn : ");
                    withdraw = s.nextInt();
                    if (balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println(" please collect your money . ");
                    } else
                    {
                        System.out.println(" Insufficient money .");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money for deposit :");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("your  money is successfully deposit . ");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("balance :  " + balance);
                    System.out.println("");
                    break;


                case 4:
                    System .exit(0);

            }
        }

    }
}