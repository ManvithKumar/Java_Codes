import java.util.*;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] adj = new int[n+1][n+1];
        for(int i =0;i<m;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u][v] = 1;
            adj[v][u] =1;
            
            System.out.println(adj[u][v]);
            System.out.println(adj[v][u]);
        }
    
    }
}
