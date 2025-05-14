import Recorrido.Bfs;
import Recorrido.Dfs;
import structures.Grafo;


public class Main {
    public static void main(String[] args) {

        Grafo<Integer> grafo = new Grafo<>(5);

        grafo.addEdge(0,1);
        grafo.addEdge(0,2);
        grafo.addEdge(1,3);
        grafo.addEdge(2,3);
        grafo.addEdge(3,4);


        System.out.println("El recorrido de los arboles empezando desde 0 es :");

        System.out.println("Recorrido por medio de bfs: ");
        Bfs.bfs(grafo, 0);

        System.out.println("Recorrido por medio de bfs: ");
        Dfs.dfs(grafo, 0);
    }
}