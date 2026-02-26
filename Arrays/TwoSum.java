/*Problem: Return indices of two numbers whose sum = target.
Input:
nums = [2,7,11,15]
target = 9
Output:
[0,1] */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
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
        System.out.println("Target: ");
        int target=sc.nextInt();
        System.out.println("Indexes: "+Arrays.toString(Solution.twoSum(arr,target)));
        sc.close();
    }
}
class Solution
{
    public static int[] twoSum(int[] arr,int target)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int need=target-arr[i];
            if(map.containsKey(need))
            {
                return new int[]{map.get(need),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}