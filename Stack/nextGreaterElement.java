/*package stack;*/

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public static int[] greaterElement(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty()&& arr[i]>arr[stack.peek()])
            {
                ans[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,1,2,4,3};
        System.out.println(" "+Arrays.toString(greaterElement(arr)));
    }
}