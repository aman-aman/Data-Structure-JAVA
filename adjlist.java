/**
 *
 * @author Aman Kumar Jha
 */
package adjlist;
import java.util.LinkedList;
import java.util.Scanner;
import javafx.util.Pair;

class adjacencylist
{
    public LinkedList< Pair<Integer, Integer> >[] adjacencylist;
    adjacencylist(int vertices)
     {
        adjacencylist = (LinkedList< Pair<Integer, Integer> >[]) new LinkedList[vertices];
        for (int i = 0; i < adjacencylist.length; ++i)
        {
            adjacencylist[i]=new LinkedList<>();
        }
    }
    void addEdge(int startvertex, int endvertex, int weight)
    {
        adjacencylist[startvertex].add(new Pair<>(endvertex, weight));
    }
    int getNumberOfvertices()
    {
        return adjacencylist.length;
    }
    int getNumberOfEdgesFromvertex(int startvertex)
    {
        return adjacencylist[startvertex].size();
    }
    LinkedList< Pair<Integer, Integer> > getEdgesFromvertex(int startvertex)
    {
        LinkedList<Pair<Integer,Integer> > edgeList=(LinkedList<Pair<Integer, Integer> >) new LinkedList(adjacencylist[startvertex]);
        return edgeList;
    }
    void printadjacencylist()
    {
        int i = 0;
        for (LinkedList< Pair<Integer, Integer> > list : adjacencylist)
            {
                System.out.print(" "+i+"->");
                for (Pair<Integer, Integer> edge : list)
                    {
                        System.out.print(edge.getKey()+" "+edge.getValue());
                    }
                ++i;
                System.out.println();
        }
    }
    boolean removeEdge(int startvertex, Pair<Integer, Integer> edge)
    {
        return adjacencylist[startvertex].remove(edge);
    }
}

class adjlist
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int vertex=s.nextInt();
        int e=s.nextInt();
        int u,v,weight;
        adjacencylist adjacencylist = new adjacencylist(vertex);
        int i = 0;
        while (i<e)
        {
            u=s.nextInt()-1;
            v=s.nextInt()-1;
            weight=s.nextInt();
            adjacencylist.addEdge(u,v,weight);
            ++i;
        }
        adjacencylist.printadjacencylist();
        adjacencylist.removeEdge(0,new Pair<>(1,1));
        adjacencylist.printadjacencylist();
    }
}
