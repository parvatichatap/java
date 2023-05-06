package array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
     /*   int[] arr =new int[4];
        arr[0] =10;
        arr[1] =20;
        arr[2] =30;
        arr[3] =40;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
double[] numarr ={ 24.5,4.5,67.8,12.4,5.4,34};
double sum=0.0;
        System.out.println(Arrays.toString(numarr));
for(double element:numarr) {
    System.out.println( element);
}
for(double num: numarr)
{
    sum+=num;
        }
double average=sum/ numarr.length;
        System.out.println(" the average is :"+average);

int[]array={ 1,2,3,4,5,6,7,8,8};
        System.out.println(Arrays.toString(array));


    }
}
