package structures;

public class Cola<T> implements ICola<T> {

    private  Nodo<T> cabeza;
    private  Nodo<T> cola;
    private  int size;

    public Cola(){
        this.cabeza = null;
        this.cola = null;
        this.size = 0;
    }

    @Override
    public void encolar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (estaVacia()) {
            cabeza = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
        }
        cola = nuevoNodo;
        size++;
    }

    @Override
    public T desencolar() {
        if (estaVacia()) {
            return null;
        }
        T dato = cabeza.dato;
        cabeza = cabeza.siguiente;
        size--;
        if (cabeza == null) {
            cola = null;
        }
        return dato;
    }

    @Override
    public T frente() {
        if (estaVacia()) {
            return null;
        }
        return cabeza.dato;
    }

    @Override
    public boolean estaVacia() {
        return cabeza == null;
    }

    @Override
    public int size() {
        return size;
    }
}