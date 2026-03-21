/*It checks the string contains duplicate or unwanted parentheses or not
if contains return true, Otherwise return false */
package Stack;

import java.util.Stack;

class DuplicateParentheses{
    public static boolean check(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==')')
            {
                int count=0;
                while(!stack.isEmpty()&&stack.peek()!='(')
                {
                    stack.pop();
                    count++;
                }
                stack.pop();
                if(count<=1)
                {
                    return true;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s="(a+b)";
        System.out.println(" "+check(s));
    }
}