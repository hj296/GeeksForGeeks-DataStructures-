//Binary Search


//Given an array arr[] of n elements, write a function to search a given element x in arr[].

/*Binary Search: Search a sorted array by repeatedly dividing the search interval in half. 
Begin with an interval covering the whole array. If the value of the search key is less than the item in the middle 
of the interval, narrow the interval to the lower half.Otherwise narrow it to the upper half. 
Repeatedly check until the value is found or the interval is empty.*/

// PROBLEM
/*An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an 
array at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. 
Devise a way to find an element in the rotated array in O(log n) time.*/

//Solution: -

import java.util.*;

public class Binary_search {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int d;
        d = sc.nextInt();
        int key = 0;
        int arr1[] = new int[n];
        key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        counterclockwise_rotate(arr1, n, d, key);

    }

    private static void counterclockwise_rotate(int arr2[], int n1, int d1, int key1) {

        int arr3[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr3[i] = arr2[i];
        }

        if (n1 == d1) {

            for (int i = 0; i < n1; i++) {
                System.out.print(arr3[i]);
            }

        }
        int temp1[] = new int[d1];


        for (int i = 0; i < d1; i++) {
            temp1[i] = arr3[i];

        }

        int k = 0;

        x:
        for (int i = d1; i < n1; i++) {
            while (k < n1) {

                arr3[k] = arr3[i];
                k++;
                continue x;
            }

        }


        int k2 = d1 - 1;

        while (d1 > 0) {
            z:
            for (int i = n1 - 1; i >= 0; i--) {

                while (k2 >= 0) {
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
        System.out.println(" ");

        int n = arr3.length;
        int result = bs(arr3,0,n-1,key1);

        if(result!=-1)
        {
            System.out.println("Index: " + result);
        }
        else{

            System.out.println("Key not found");
    }
}

    public static int bs(int array[],int l,int h,int key2 )
    {
        if (l > h)
            return -1;

        int mid = (l+h)/2;
        if (array[mid] == key2)
            return mid;

       
        if (array[l] <= array[mid])
        {
            
            if (key2 >= array[l] && key2 <= array[mid]) //Checking if key lies on left side of array[mid] or right.
                return bs(array, l, mid-1, key2);
            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
            return bs(array, mid+1, h, key2); //Changing array[mid] since the key is not present on LHS of the array[mid]
        }


        if (key2 >= array[mid] && key2 <= array[h]) //To find the key if it is located on RHS of array[mid] and RHS of array[mid] is sorted
            return bs(array, mid+1, h, key2);

        return bs(array, l, mid-1, key2); //If array[mid... h] is not sorted subarry
    }
}

