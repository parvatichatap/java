package array;

public class ArrEx {
    public static void main(String[] args) {
        int[] a = {1, 2, 43, 4, 35,12};
        System.out.println("Accessing Element in array  ");
        System.out.println("first  Element :" + a[0]);
        System.out.println("Second Element :" + a[1]);
        System.out.println("Third  Element :" + a[2]);
        System.out.println("Fourth  Element:" + a[3]);
        System.out.println("Fifth   Element:" + a[4]);
        System.out.println();

        System.out.println("-------Using loop----------");

        for (int i = 0; i < a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(" ----------Using For-each loop----------");
        for( int i:a)
        {
            System.out.println(i);
        }
        System.out.println("----------- sum average -----------");
        int sum=0;
        double Average;
        for(int i:a)
        {
         sum += i;
        }
        Average= ((double)sum/ (double)a.length );
        System.out.println(" Sum = "+sum);
        System.out.println("Average = "+Average);

    }

}
