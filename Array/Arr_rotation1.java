import java.util.Scanner;

public class Arr_rotation1 {

    public static void main(String args[])
    {
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

        rotate1(arr1,n,d);


    }

    private static void rotate1(int arr2[],int n1, int d1) {

        int arr3[] = new int[n1];

        for(int i=0;i<n1;i++)
        {
            arr3[i] = arr2[i];
        }

        if (n1 == d1) {

            for(int i=0;i<n1;i++)
            {
                System.out.print(arr3[i]);
            }

        }
        int temp1[] = new int[d1];


        for (int i = 0; i < d1; i++) {
            temp1[i] = arr3[i];

        }

        int k=0;

      x:  for(int i=d1;i<n1;i++)
        {
            while(k<n1)
            {

                arr3[k] = arr3[i];
                k++;
                continue x;
            }

        }


        int k2 = d1-1;

        while(d1>0) {
            z: for (int i = n1-1; i>=0; i--) {

                while(k2>=0) {
                        arr3[i] = temp1[k2];
                        k2--;
                        d1--;
                        continue z;
                }

            }
        }


        for(int i=0;i<n1;i++)
        {
            System.out.print(arr3[i]+" ");
        }

        }
    }




