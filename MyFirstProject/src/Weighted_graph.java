import java.util.*;
class Weighted_graph{
     class Pair{
          private int first_element;
          private int second_element;

          public Pair(int first_element,int second_element){
             this.first_element=first_element;
             this.second_element=second_element;
          }

          public int getFirst(){
            return this.first_element;
          }
          public int getSeconf(){
            return this.second_element;
          }
    }
    List<List<Pair>>adj;
    private boolean undirected;
    public Weighted_graph(int n,boolean undirected){
         this.adj=new ArrayList<>();
         for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
         }
         this.undirected=undirected;
    }
    public void addEdge()
    
}