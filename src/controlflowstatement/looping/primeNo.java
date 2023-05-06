package controlflowstatement.looping;

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
       /** String yn;
        do {


            Scanner s = new Scanner(System.in);
            System.out.println("Enter any number");
            int num = s.nextInt();

            int flag = 0;
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime Number");

                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                System.out.println(num + "is a Prime Number");
            System.out.println("Do u want ro continue (press y)");
            yn = s.next();
        } while (yn.equals("y") || yn.equals("Y"));

    */


        // 1 to 100 prime
        int temp = 0;
        for (int no = 1; no <= 100; no++) {
            for (int i = 2; i <= no - 1; i++) {
                if (no % i == 0) {
                    temp = temp + i;
                }
            }
            if(temp==0){
                System.out.println(no);
            }
            else {
                temp=0;
            }
        }
    }
}

