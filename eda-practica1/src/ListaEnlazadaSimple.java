import java.util.Objects;

public class ListaEnlazadaSimple<T> {
    private Nodo<T> cabeza;

    public ListaEnlazadaSimple() {
        cabeza = null;
    }

    public void insertarAlInicio(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void insertarAlFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }
        Nodo<T> actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    public void mostrarLista() {
        Nodo<T> actual = cabeza;
        System.out.print("Estado: ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public int contarNodos() {
        int cantidad = 0;
        Nodo<T> actual = cabeza;
        while (actual != null) {
            cantidad++;
            actual = actual.siguiente;
        }
        return cantidad;
    }

    // Paso 4: busqueda secuencial sin modificar cabeza.
    public boolean buscar(T valorBuscado) {
        Nodo<T> actual = this.cabeza;
        while (actual != null) {
            if (Objects.equals(actual.dato, valorBuscado)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
}
