/*
1️⃣ Second Largest Element
Problem:
Find the second largest element in the array.
Do not sort the array.
Example 1
Input:
[12, 35, 1, 10, 34, 1]
Output:
34
Example 2
Input:[5, 10, 10]
Output:
5
Example 3
Input:
[7, 7, 7]
Output:
No second largest element */

import java.util.Scanner;

public class Secondlargest {
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
        Solution1.secondLargest(arr);
        sc.close();
    }
}
class Solution1
{
    public static void  secondLargest(int[] arr)
    {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>first)
            {
                second=first;
                first=i;
            }
            else if(i<first && i>second)
            {
                second=i;
            }
        }
        if(second==Integer.MIN_VALUE)
            System.out.println("No second largest element");
        else
            System.out.println("Second largest element: "+second);
    }
}