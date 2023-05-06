package controlflowstatement;

public class pattern {
    public static void main(String[] args) {
        System.out.println("------------ 1----------");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("--------------------------2-------------------");

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------3  Diamond -------------------");
        int i, j, p;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (p = 1; p <= (2 * i - 1); p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 4; i >= 1; i--) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (p = 1; p <= (2 * i - 1); p++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("--------------------------- 4-----------------------");
       for (i = 4; i >= 1; i--) {
            for  (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (p = 1; p <= (2 * i - 1); p++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("-----------------      5    pyramid---------------");

        for (i = 1; i <= 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (p = 1; p <= (2 * i - 1); p++) {
                System.out.print("*");
            }
            System.out.println();

        }


        System.out.println("----------------- 6----------------");
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= 4; i++) {
            for (j = 3; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------- 7---------------");
        for (i = 1; i <= 4; i++) {
            for (j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (p = 1; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------- 8-----------------------");
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (p = 4; p >= i; p--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------- 9-------------------");
        for (i = 1; i <= 4; i++) {
            for (j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (p = 1; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (p = 3; p >= i; p--) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println(" ---------------------10-------------------------");
        for (i = 1; i <= 4; i++)
        {
            for (j = 4; j > i; j--)
            {
                System.out.print(" ");
            }
            for (p = 1; p <= i; p++) {

                if (i >= 2 && p > 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
                     System.out.println();

            }
        System.out.println("-------------------------------11---------------------------");
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i>=2 && j<=i-1){
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        }
    }







