public class App {
    public static void main(String[] args) throws Exception {
       GraphL graphl =new GraphL(5, true);
        graphl.addEdge(0, 1);
        graphl.addEdge(0, 3);
        graphl.addEdge(2, 1);
        graphl.addEdge(3, 2);
        graphl.addEdge(4, 3);

        graphl.PrintMatrix();
    }
}
