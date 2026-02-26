/*
Problem: Find the largest element in the array.
Input:
[3, 7, 2, 9, 5]
Output:
9
 */

import java.util.Scanner;

public class Largestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int k=sc.nextInt();
        int[] arr=new int[k];
        System.out.print("Enter the numbers greater than 0: ");
        for(int i=0;i<k;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest Element is: "+Solution.largest_Element(arr));
        sc.close();
    }
}
class Solution
{
    public static int largest_Element(int[] arr)
    {
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        return largest;
    }
}