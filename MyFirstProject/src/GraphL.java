import java.util.ArrayList;
import java.util.Queue;
import java.util.*;

//Adjececncy List
public class GraphL {
    private boolean undirected;
    private ArrayList<ArrayList<Integer>>adj=new ArrayList<>();;//research more(there was a null pointer error cause we have nor initialised the adjecency list)

    public GraphL(int n,boolean undirected){
        // this.adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> list=new ArrayList<>();
            adj.add(list);
        }
        this.undirected=undirected;
    }
    public void addEdge(int u,int v){
        adj.get(u).add(v);
        if(undirected){
            adj.get(v).add(u);
        }
    }
    public void PrintMatrix(){
        for(ArrayList<Integer>kuchbi:adj){
            System.out.println(kuchbi.toString());
        }
    }
    public void bfscore(int source, boolean [] visited){
        //https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/  if the root node is unknown
        if(visited[source]==false){
            visited[source]=true;
        Queue<Integer> pq = new LinkedList<>();
        pq.add(source);
        while(pq.size()>0){
            System.out.println(pq.peek());
            int top=pq.remove();
            ArrayList<Integer>neighbours=adj.get(top);
            for(Integer neighbour:neighbours){
                if(visited[neighbour]==false){
                    visited[neighbour]=true;
                    pq.add(neighbour);
                }
            }

        }
        
        }
        
//time complexity of BFS is O(V+E) v is the number of vertices and E is the number of edges
// weighted Graph
//https://www.techiedelight.com/least-cost-path-weighted-digraph-using-bfs/
    }
    public void bfs(){
        boolean visited[]=new boolean[adj.size()];
        Arrays.fill(visited,false);
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false){
                 bfscore(i, visited);
            }
        }
    }
}
//toString() − This returns a String object representing the value of this Integer.

// toString(int i) − This returns a String object representing the specified integer