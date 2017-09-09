import java.util.*;

public class linklist
{
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.addLast("i");
        ll.addFirst("r");
        System.out.println("Linked list : " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Linked list after removing: " + ll);
        int size = ll.size();
        System.out.println("Size of linklist = " + size);
        System.out.println("Linked list after change : " + ll);
    }
}
