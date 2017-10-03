
import java.util.*;

class iterator {

    /**
     aman kumar jha
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer>v=new ArrayList<Integer>();
        for(int i=1;i<=10;i++)
        {
            v.add(i+1*10);
        }
        //System.out.println(v.size());
        Iterator e=v.iterator();
        while(e.hasNext())
        {
            //System.out.println(e.nextElement().toString());
            int i=(int)e.next();
            System.out.println(i);
           // System.out.println("aman\n");
        }
    }

}
