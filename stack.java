import java.io.*;
import java.util.*;
class stack
{
    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++)
        {
                int u=s.nextInt();
            stack.push(u);
        }
        int si=stack.size();
        System.out.println(si);
        while(!stack.empty())
        {
            int x=stack.peek();
            stack.pop();
            System.out.println(x);
        }
    }
}
