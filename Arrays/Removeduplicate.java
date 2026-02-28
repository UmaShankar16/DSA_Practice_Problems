/*
3️⃣ Remove Duplicates from Sorted Array
Problem:
Given a sorted array, remove duplicates in-place
and return the updated array.
Example 1
Input:
[1, 1, 2]
Output:
2
Example 2
Input:
[0,0,1,1,1,2,2,3,3,4]
Output:
5
Example 3
Input:
[1,1,1,1]
Output:
1 */

import java.util.Scanner;

public class Removeduplicate {
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
        System.out.println("New Array length "+Solution3.removeDuplicate(arr));
        sc.close();
    }
}
class Solution3
{
    public static int removeDuplicate(int[] arr)
    {
        int i=0;
        int j=1;
        while(j<arr.length)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
            j++;
        }
        return i+1;
    }
}