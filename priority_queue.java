import java.io.*;
import java.util.*;
class queue_p
{
    void fun()
    {
        Scanner s=new Scanner(System.in);
        int a;
        Queue q=new PriorityQueue();
        //PriorityQueue q=new PriorityQueue();
        do
        {
            a=s.nextInt();
            q.offer(((Object)a));
            
        }while(a!=-1);
        Iterator it=q.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
    public static void main(String ar[])
    {
        queue_p obj=new queue_p();
        obj.fun();
        
    }
}
