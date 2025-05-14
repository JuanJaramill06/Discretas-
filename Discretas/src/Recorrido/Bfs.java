package Recorrido;

import structures.Grafo;
import structures.Cola;

public class Bfs {

    // Método para realizar el recorrido BFS
    public static <T> void bfs(Grafo<T> grafo, int start) {
        // Obtenemos el número total de vértices en el grafo
        int totalVertices = grafo.getNumVertices(); // Cambié esto para que use el número de vértices

        // Usamos un arreglo de booleanos para marcar los nodos visitados
        boolean[] visited = new boolean[totalVertices]; // El tamaño del arreglo se debe basar en los vértices

        // Creamos una cola para almacenar los nodos pendientes de visitar
        Cola<T> cola = new Cola<>();
        cola.encolar((T) Integer.valueOf(start));  // Encolamos el nodo de inicio

        // Mientras la cola no esté vacía
        while (!cola.estaVacia()) {
            T current = cola.desencolar();  // Desencolamos un nodo

            // Convertimos el nodo de tipo T a un índice entero
            int currentVertex = (Integer) current;

            // Si el nodo no ha sido visitado, lo procesamos
            if (!visited[currentVertex]) {
                System.out.println(current);  // Procesamos el nodo (en este caso lo imprimimos)
                visited[currentVertex] = true;  // Marcamos el nodo como visitado
            }

            // Encolamos los nodos adyacentes no visitados
            for (T neighbor : grafo.getAdjVertices(currentVertex)) {
                int neighborVertex = (Integer) neighbor;
                if (!visited[neighborVertex]) {
                    cola.encolar(neighbor);  // Encolamos al vecino
                }
            }
        }
    }
}
