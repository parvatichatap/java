package controlflowstatement;
import java.util.Scanner;
public class SwtichEx {
    public static void main(String[] args) {
       /* int num1, num2;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1,num2,operator");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        operator = scanner.next().charAt(0);



            switch (operator) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                default:
                    System.out.println("not mathches");


            }*/
        Scanner s= new Scanner(System.in);
           // int day=2;
        System.out.println(" Enter any day num");
            int num=s.nextInt();

                switch (num) {
                    case 1:
                        System.out.println(" monday");
                        break;
                    case 2:
                        System.out.println(" tuesday");
                        break;
                    case 3:
                        System.out.println(" wednesday");
                        break;
                    case 4:
                        System.out.println("thursday");
                        break;
                    case 5:
                        System.out.println("friday");
                        break;
                    case 6:
                        System.out.println(" saturday");
                        break;
                    case 7:
                        System.out.println(" sunday");
                        break;
                    default:
                        System.out.println(" week name");

                }

    }
    }

