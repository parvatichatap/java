package controlflowstatement;

public class IfElseDemo {
    public static void main(String[] args) {
    int age=30;
    String nationality="India";

    if(nationality =="India"){
        if(age>=18){
            System.out.println("you can vote");
        }else{
            System.out.println("you can not vote");
        }

        }else {
        System.out.println("you are not indian");
    }
    //*******          if else if  // *****

int a= 12450, b= 2800, c= 465660,d=1230;
    if(a > b && a > c && a > d){
        System.out.println(" a is greater ");
    }
    else if(b > c &&  b > d){
        System.out.println("b is greater ");

        }else if(c> d){
        System.out.println("c is greater");
    }
    /// nested if
    int f=70380,g=8403,h=9250;
    if( f > g && f>h){
        System.out.println(" f is greater");
        if(g > h){
            System.out.println("g is greater");
        }
    }
    }
    }


