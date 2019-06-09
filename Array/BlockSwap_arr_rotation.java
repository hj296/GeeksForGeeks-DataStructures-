//Block swap algorithm for array rotation

/*Initialize arrays A and B as:
A = arr[0….d-1] and B = arr[d….size-1]
Repeat until size of A = size of B.
    If A is shorter:
        Divide B into Bl and Br such that Br is of same length as A.
        Swap A and Br to change ABlBr into BrBlA.
        Now A is at its final place. Recur on pieces of B.
    If A is longer:
        Divide A into Al and Ar such that Al is of same length as B.
        Swap Al and B to change AlArB into BArAl.
        Now B is at its final place. Recur on pieces of A.
Finally when A and B are of equal size, block swap them.

Initialize arrays A and B as:
A = arr[0….d-1] and B = arr[d….size-1]
Repeat until size of A = size of B.
    If A is shorter:
        Divide B into Bl and Br such that Br is of same length as A.
        Swap A and Br to change ABlBr into BrBlA.
        Now A is at its final place. Recur on pieces of B.
    If A is longer:
        Divide A into Al and Ar such that Al is of same length as B.
        Swap Al and B to change AlArB into BArAl.
        Now B is at its final place. Recur on pieces of A.
Finally when A and B are of equal size, block swap them. */

import java.util.*;

public class BlockSwap_arr_rotation {

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

        blockswaprotate(arr1,n,d);
    }

    public static void blockswaprotate(int arr2[],int n1, int d1)
    {
        int arr3[] = new int[n1];

        for(int i=0;i<n1;i++)
        {
            arr3[i] = arr2[i];
        }
        if (n1 == d1 || d1==0) {

            for(int i=0;i<n1;i++)
            {
                System.out.print(arr3[i]);
            }

        }

        int m=d1;
        int n = n1-d1;

        while(m!=n)
        {

            if(m<n) //A is shorter
            {
                swap(arr3,d1-m,n ,m);
                n = n-m;

            }

            else //B is shorter
            {
                swap(arr3,d1-m,d1,n);//Here n corresponds to the number of swapping to be done.
                m = m-n;
            }



        }
        swap(arr3, d1-m, d1, m);

        printArray(arr3, n1);

    }

  public static void swap(int []array,int a,int b,int m)//Here a acts as starting index and b acts as ending index.
    {

        int i, temp;
        for(i = 0; i<m; i++)
        {
            temp = array[a + i];
            array[a + i] = array[b + i];
            array[b + i] = temp;
        }
    }

    public static void printArray(int result[],int arrsize)
    {
        for(int z=0;z<arrsize;z++)
        {
            System.out.print(result[z]);
        }
    }
}

