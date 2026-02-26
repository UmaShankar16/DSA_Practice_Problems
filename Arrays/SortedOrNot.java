/*Problem: Return true if array is sorted in non-decreasing order.
Input:
[1, 2, 2, 5]
Output:
true
Input:
[1, 3, 2]
Output:
false */

import java.util.Scanner;

public class SortedOrNot {
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
        System.out.println("Array is Sorted: "+Solution.sorted(arr));
        sc.close();
    }
}
class Solution{
    public static boolean sorted(int[] arr)
    {
        int left=0;
        int right=1;
        if(arr.length==1)
            return true;
        while(right<arr.length)
        {
            if(arr[left]>arr[right])
                return false;
            left++;
            right++;
        }
        return true;
    }
}