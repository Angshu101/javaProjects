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
        System.out.println("The BFS graph is:-");
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
   
    //toString() − This returns a String object representing the value of this Integer.

// toString(int i) − This returns a String object representing the specified integer
public void dfscoreiterative(int source,boolean [] visited ){
    System.out.println("The DFS of the Given Graph");
    if(visited[source]==false){
        visited[source]=true;
    }
    Stack<Integer>stack=new Stack<>();
    stack.add(source);
    while(!stack.isEmpty()){
        int top=stack.pop();
        System.out.println(top);
        List<Integer>neighbours=adj.get(top);
        for(Integer neighbour:neighbours){
            if(visited[neighbour]==false){
                visited[neighbour]=true;
                stack.push(neighbour);
            }
        }

    }
}
public void dfsrecursive(int source,boolean [] visited){
    System.out.println(source);
    if(visited[source]==false){
        visited[source]=true;
        List<Integer>neighbours=adj.get(source);
        for(Integer neighbour:neighbours){
            if(visited[neighbour]==false){
            dfsrecursive(neighbour, visited);
            }
        }
    }
}
public void graph(){
    boolean visited[]=new boolean[adj.size()];
    Arrays.fill(visited,false);
    for(int i=0;i<visited.length;i++){
        if(visited[i]==false){
             bfscore(i, visited);
            //  dfscoreiterative(i, visited);
        }
    }
    Arrays.fill(visited,false);
    for(int i=0;i<visited.length;i++){
        if(visited[i]==false){
            dfscoreiterative(i, visited);
        }
    }
    Arrays.fill(visited,false);
    //recusrsive solution maybe different from iterative solution of dfs but it must follow the property of dfs
    System.out.println("The Recusive Solution");
    for(int i=0;i<visited.length;i++){
        if(visited[i]==false){
            dfsrecursive(i, visited);
        }
    }
}
}
