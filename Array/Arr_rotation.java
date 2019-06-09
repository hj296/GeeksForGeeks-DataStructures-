import java.util.*;

public class Arr_rotation {

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

            rotate(arr1,n,d);


        }

        private static void rotate(int arr2[],int n1, int d1) {

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


            int temp[] = new int[d1];

            for (int i = 0; i < d1; i++) {
                temp[i] = arr3[i];
                arr3[i] = 0;
            }

            /*for(int i=0;i<n1;i++)
            {
                System.out.print(arr3[i]);
            }*/
            int k=0;

            int temp2[] = new int[n1];
            //Very Important
           x:  for (int i = 0; i < n1; i++) {

                 while(k<n1) {

                    if (arr3[i]!=0) {

                        temp2[k] = arr3[i];
                        k++;

                        continue x;

                    }

                    else{

                        continue x;
                    }





                }

            }

           /* for(int i=0;i<n1;i++)
            {
                System.out.print(temp2[i]);
            }*/

            //For Transferring data from 1 array to another with specific condition. (To increase the index of second array)

            int k2 = d1-1;

            while(d1>0) {
                z: for (int i = n1 - 1; i >= 0; i--) {

                    while(k2>=0) {
                        if (temp2[i] == 0) {
                            temp2[i] = temp[k2];
                            k2--;
                            d1--;
                            continue z;
                        }
                    }
                    break z;


                }
            }

            for(int i=0;i<n1;i++)
            {
                System.out.print(temp2[i]+" ");
            }
        }





    }

