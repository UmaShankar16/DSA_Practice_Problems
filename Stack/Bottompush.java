package Stack;
/*To push an element at the bottom of stack*/
import java.util.*;
class Bottompush
{
    public static void pushToBottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushToBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        pushToBottom(s,4);
        while(!s.isEmpty())
        {
            System.out.println(" "+s.peek());
            s.pop();
        }
    }
}