package Recorrido;

import structures.Grafo;
import structures.Pila;

public class Dfs {

    // Método para realizar el recorrido DFS
    public static <T> void dfs(Grafo<T> grafo, T start) {
        // Obtenemos el número total de vértices en el grafo
        int totalVertices = grafo.getNumVertices();  // Método para obtener el número total de vértices

        // Usamos un arreglo de booleanos para marcar los nodos visitados
        boolean[] visited = new boolean[totalVertices];  // El tamaño debe ser el total de vértices

        // Creamos una pila para almacenar los nodos pendientes de visitar
        Pila<T> pila = new Pila<>();
        pila.apilar(start);  // Apilamos el nodo de inicio

        while (!pila.estaVacia()) {
            T current = pila.desapilar();  // Desapilamos un nodo

            // Convertimos el nodo de tipo T a un índice entero (suponemos que es un entero)
            int currentVertex = (Integer) current;

            // Si el nodo no ha sido visitado, lo procesamos
            if (!visited[currentVertex]) {
                System.out.println(current);  // Procesamos el nodo (en este caso lo imprimimos)
                visited[currentVertex] = true;  // Marcamos el nodo como visitado
            }

            // Apilamos los nodos adyacentes no visitados
            for (T neighbor : grafo.getAdjVertices(currentVertex)) {
                int neighborVertex = (Integer) neighbor;
                if (!visited[neighborVertex]) {
                    pila.apilar(neighbor);  // Apilamos al vecino
                }
            }
        }
    }
}
