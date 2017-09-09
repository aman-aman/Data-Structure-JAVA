import java.util.*;
import java.util.Map;
class hashset
{
    void fun()
    {
        HashMap hm=new HashMap();
        int a;
        String s;
        Scanner sc=new Scanner(System.in);
        do
        {
            a=sc.nextInt();
            s=sc.nextLine();
            hm.put(a, s);
            
        }while(a!=-1);
        Iterator it=hm.entrySet().iterator();
        while(it.hasNext())
        {
            System.out.println();
        }
    }
    public static void main(String ar[])
    {
        String [][]s=new String[5][2];
        s[0]=ar;
        int x=s[0].length;
        for(int i=0;i<x;i++)
        {
            System.out.println(s[0][i]);
        }
        /*hashset obj=new hashset();
        obj.fun();()*/
    }
}
