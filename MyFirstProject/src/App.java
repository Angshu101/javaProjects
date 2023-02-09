public class App {
    public static void main(String[] args) throws Exception {
       GraphL graphl =new GraphL(7, true);
        graphl.addEdge(0, 1);
        graphl.addEdge(0, 3);
        graphl.addEdge(1, 2);
        graphl.addEdge(2, 3);
        graphl.addEdge(3, 4);
        graphl.addEdge(5, 6);

        graphl.bfs();
    }
}
