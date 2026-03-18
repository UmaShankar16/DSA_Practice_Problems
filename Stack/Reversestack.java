/*To Reverse a Stack */
package Stack;
import java.util.*;
public class Reversestack {
    public static void reverse(Stack<Integer> s)
    {
        Stack<Integer> s1 = new Stack<>();
        if(s.isEmpty())
        {
            s1.push(0);
            return;
        }
        int top=s.pop();
        reverse(s);
        s1.push(top);
        while(!s1.isEmpty())
        {
            System.out.println(" "+s1.peek());
            s1.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("After Reverse");
        reverse(s);
    }
}
