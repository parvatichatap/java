package array;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        int  num ;
        for(int i=0;i< arr.length;i++) {
            System.out.println("Enter any number");
            num = scanner.nextInt();
            arr[i] = num;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:-");
        int num=s.nextInt();
        System.out.println(" you enterd :-"+num);
        System.out.println(" Enter String");
        String name=s.next();
        System.out.println(" you entered :-"+name);
        System.out.println(" Enter char :-");
        char ch=s.next().charAt(0);
        System.out.println(" you enterd :- "+ch);
        System.out.println("Enter float");
        float f=s.nextFloat();
        System.out.println(" you enterd:- "+f);
        System.out.println("Enter long");
        Long l=s.nextLong();
        System.out.println(" you entered:- "+l);



        }
    }


