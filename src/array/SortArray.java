package array;

import java.util.ArrayList;

public class SortArray {
    public static void main(String[] args) {
        /* int temp;
        int i=0;
        int[] arr={ 1,23,4,5,5,634};
              /** for(int i=0;i<arr.length;i++)
               {
                 for(int j=i+1;j<arr.length;j++)
                 {
                     if(arr[i]>arr[j]){
                         temp=arr[i];
                         arr[i]=arr[j];
                         arr[j]=temp;
                     }
                     System.out.println(arr[i]);
                     i++;
                 }
               }
        while(i<arr.length){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
            i++;
        }*/
//Linear serch sort
        int temp = 0;
        int item = 6;
        int[] arr = {1, 23, 4, 5, 5, 6, 34};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println("item is present in :- " + i + "index position");
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println(" item is not found in list");
        }
/* [] a ={"sham","ram","ganesh","rohini","nana","balaji"};
        String name="ram";
        for(int i=0;i<=a.length;i++)
        {
            if(a[i]== name)
            {
                System.out.println(" name is present in :- " +i+" in index position ");
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println(" name is not present in index");
        }*/

        int[] ar = {1, 2,  7, 7, 4, 5, 5, 9};
        //List<Integer> list=new ArrayList<>();
        for (int i = 1; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {

                // if((ar[i]==ar[j])&& (i!=j))
                if (ar[i] == ar[j]) {
                    // System.out.print(ar[j]+", ");
                    System.out.println(" first duplicate number is:-" + ar[i]);

                }
            }
            }
        }
    }



