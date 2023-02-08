import java.util.ArrayList;

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
}
//toString() − This returns a String object representing the value of this Integer.

// toString(int i) − This returns a String object representing the specified integer