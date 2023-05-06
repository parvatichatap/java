package controlflowstatement.looping;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int i, j, k, n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows u want to print  ");
        n = s.nextInt();
        System.out.println("------------------------- 1-----------------------------------");
        for (i = 1; i <=n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------2----------------------------------");
        for (i = 1; i <= n; i++) {
            for (j = n-1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------3-----------------------------------------");

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k >= (2 * i - 1); k++) ;
            {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("-------------------------------------------4----------------------------------");
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            // for(p=1;p<=(2*i-1);p++)
            for (k = 1; k <= 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------- 5--------------------------------------");
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------6-------------------");
        for (i = n; i >= 1; i--)
        {
            for  (j = n; j > i; j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------7------------------------------------");

            for (i = n; i >= 1; i--) {
                for (j = n; j >= i; j--) {
                    System.out.print(" ");
                }
                for(k=1;k<=(2*i-1);k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(i=1;i<=n;i++)
                {
                    for(j=n;j>=i;j--)
                 {
                  System.out.print(" ");
                       }
          for(k=1;k<=(2*i-1);k++)
          {
              System.out.print("*");
          }
            System.out.println();
        }
        System.out.println("---------------------8------------------------");
            for(i=1;i<=n;i++)
            {
                for(j=i;j<=n;j++)
                {
                    System.out.print(" ");
                }
                for(k=1;k<=(i*2);k++) {
                    if (k == 1 || k == i * 2 - 1 || (i == n && k % 2 == 1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    }

                System.out.println();

            }
        }
    }



