/*
Problem:
An element is called a leader if it is greater than all elements to its right.
Find all leaders in the array.
🧪 Example 1
Input:
[16, 17, 4, 3, 5, 2]
Output:
[17, 5, 2]
🧪 Example 2
Input:
[1, 2, 3, 4]
Output:
[4]
🧪 Example 3
Input:
[7, 4, 5, 7, 3]
Output:
[7, 7, 3] */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Leaders {
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
        Solution3.leader(arr);
        sc.close();
    }  
}
class Solution3
{
    public static void leader(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int maxRight=arr[arr.length-1];
        int i=arr.length-1;
        list.add(maxRight);
        while(i>=0)
        {
            if(maxRight<arr[i])
            {
                list.add(arr[i]);
                maxRight=arr[i];
            }
            i--;
        }
        Collections.reverse(list);
        System.out.println(" "+list);
    }
}