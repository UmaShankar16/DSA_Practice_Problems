import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static int[] stock(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                ans[i]=i+1;
            }
            else{
                ans[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr = {100,80,60,70,60,75};
        System.out.println(" "+Arrays.toString(stock(arr)));
    }
}
