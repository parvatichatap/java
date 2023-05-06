package controlflowstatement;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int no=s.nextInt();

        switch(no)
        {
            case  1:
                System.out.println("one");
                switch (no){
                    case 1:
                        System.out.println(" in inner loop");
                        break;
                    case 2:
                            System.out.println("in switch  inner case" );
                            break;
                }
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
                case 4:
                    System.out.println("four");
                    break;
            default:
                System.out.println("no matchs");
        }



        }
    }

