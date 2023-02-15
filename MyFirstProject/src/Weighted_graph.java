// import java.util.*;
// class Weighted_graph{
//      class Pair{
//           private int first_element;
//           private int second_element;

//           public Pair(int first_element,int second_element){
//              this.first_element=first_element;
//              this.second_element=second_element;
//           }

//           public int getFirst(){
//             return this.first_element;
//           }
//           public int getSecond(){
//             return this.second_element;
//           }
//     }
//     List<List<Pair>>adj;
//     private boolean undirected;
//     public Weighted_graph(int n,boolean undirected){
//          this.adj=new ArrayList<>();
//          for(int i=0;i<n;i++){
//             adj.add(new ArrayList<>());
//          }
//          this.undirected=undirected;
//     }
//     public void addEdge(int u,int v,int weight){
//       this.adj.get(u).add(new Pair(v, weight));
//       if(undirected){
//         this.adj.get(v).add(new Pair(u, weight));
//       }
//     }
//     public void zero_oneBFS(int source,boolean [] visited){
//         if(visited[source]==false){
//             visited[source]=true;
//         }
//         Deque<Pair> pq = new ArrayDeque<Pair>();
//         pq.add(new Pair(source,0));
//         while(!pq.isEmpty()){
            
//             Pair top=pq.remove();
//             int currentnode=top.first_element;
//             System.out.println(currentnode);
//             ArrayList<Pair>neighbours=adj.get(currentnode);
           
//             for(Pair neighbour: this.adj.get(currentnode)){
//                 int weightI=neighbour.getSecond();
//                 int node =neighbour.getFirst();
//                 // System.out.println("Second Block Test");
//                 // System.out.println("The current node is"+node+" The weight is :"+weightI);
//                 if(visited[currentnode]==false){
//                     visited[currentnode]=true;
//                     if(weightI==0){
//                         pq.addFirst(new Pair(node, weightI));
//                         System.out.println("check 0");
//                     }
//                     else{
//                     pq.addLast(new Pair(node, weightI));
//                     System.out.println("check 1");
//                     }
//                 }
//             }
//         }
//     }
//     public void bfs(){
//         boolean visited[]=new boolean[this.adj.size()];
//         Arrays.fill(visited,false);
//         for(int i=0;i<visited.length;i++){
//             if(visited[i]==false){
//                  zero_oneBFS(i, visited);
//             }
//         }
//     }
    
// }