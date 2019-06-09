
//Program to cyclically rotate an array by a given number d

import java.util.*;

public class Cyclically_rotate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int d;
        d = sc.nextInt();
        int arr1[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }

        cyclically_rotate(arr1,n,d);


    }

    private static void cyclically_rotate(int [] array,int n1,int d1)

    {
        if (n1 == d1 || n1==0) {

            for(int i=0;i<n1;i++)
            {
                System.out.print(array[i]);
            }

        }

        int j=n1-1;

        int temp1[] = new int[d1];

       x: for(int i = 0;i<d1;i++)
        {
            while(j>=n1-d1)
            {
                temp1[i]=array[j];
                j--;
                continue x;
            }
        }
       int k=d1;

       z: for(int i=n1-1;i>=d1;i--)
        {

            while(k>=0) {
                array[i] = array[k];
                k--;
                continue z;
            }
        }

        int k1=d1-1;

        y: for(int i=0;i<d1;i++)
        {
            while(k1>=0)
            {
                array[k1] = temp1[i];
                k1--;
                continue y;
            }

        }

        for(int i=0;i<n1;i++)
        {
            System.out.print(array[i]+" ");
        }


    }
}
