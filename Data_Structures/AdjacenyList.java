import java.util.LinkedList;
import java.util.Scanner;

public class AdjacenyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vertices and  Edges");
        int v = sc.nextInt();
        int e = sc.nextInt();
        graph g = new graph(v);
        System.out.println("Enter Edges");
        for(int i =0;i<e;i++)
        {
            int s = sc.nextInt();
            int d =sc.nextInt();

            g.insertEdge(s, d);
        }
    }
    public class graph{
        public LinkedList<Integer> adj[];
    public graph(int v){
        adj = new LinkedList[v];

        for(int i=0;i<v;i++)
        {
            adj[i] = new LinkedList<Integer>();
        }
    }
    public void insertEdge(int s,int d){
        adj[s].add(d);
        adj[d].add(s);

        System.out.println(adj[d]);
        System.out.println(adj[s]);
    }
}

}