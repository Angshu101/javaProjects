import java.util.Arrays;

public class GraphA {
    private int [][] matrix;
    private boolean undirected;

    public GraphA(int n,boolean undirected){
        //Based on the size of the graph we will be creating the adjecency matrix
        matrix =new int[n][n];
        this.undirected=undirected;
    }
   public void addEdge(int u,int v){
    matrix[u][v]=1;
    if(undirected){
        matrix[v][u]=1;
    }
   }
   public void PrintMatrix(){
    for(int[] row:matrix){
        System.out.println(Arrays.toString(row));
    }
   }
}
//Complexity is O(n^2)
//The first implementation is when it is called as a method of an object instance. The example below shows this implementation
//toString() − This returns a String object representing the value of this Integer.


//The second implementation is when you call the member method of the relevant class by passing the value as an argument. The example below shows how to do this
// toString(int i) − This returns a String object representing the specified integer