package structures;

import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {

    private final List<List<T>> adjList;

    public Grafo(int vertices) {
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        // Asegúrate de que u y v estén dentro del rango de nodos válidos
        if (u >= 0 && u < adjList.size() && v >= 0 && v < adjList.size()) {
            adjList.get(u).add((T) Integer.valueOf(v)); // Suponemos que los vértices son enteros
            adjList.get(v).add((T) Integer.valueOf(u)); // Suponemos que los vértices son enteros
        } else {
            throw new IndexOutOfBoundsException("Los índices u y v deben estar dentro del rango de vértices");
        }
    }

    public List<T> getAdjVertices(int vertex) {
        return adjList.get(vertex);
    }

    public int getNumVertices() {
        return adjList.size();
    }
}
