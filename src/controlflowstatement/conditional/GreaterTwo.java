package controlflowstatement.conditional;
//WAP to find the largest two or three number.
public class GreaterTwo {
    public static void main(String[] args) {
        int a = 400, b = 200, c = 600;//Two number
        if (a > b) {
            System.out.println(" a is greater ");
        } else {
            System.out.println(" b is greater ");
        }
        if (a > b)
        {
            if (a > c) {
                System.out.println("a greater");
            }
             else
                {
                    System.out.println(" b greater");
                }



                if (a > b && a > c) {
                    System.out.println(" a greater ");
                } else if (b > c) {
                    System.out.println("b  greater ");
                } else {
                    System.out.println(" c greater ");
                }
            }
        }
    }

