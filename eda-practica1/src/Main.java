public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<>();

        // Paso 1: inserciones al inicio.
        lista.insertarAlInicio(30);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(10);

        // Paso 2: inserciones al final.
        lista.insertarAlFinal(40);
        lista.insertarAlFinal(50);

        // Paso 3: visualizar y contar nodos.
        lista.mostrarLista();
        System.out.println("Cantidad de nodos: " + lista.contarNodos());

        // Paso 4: busqueda secuencial (habilitado).
        System.out.println("Buscar 30 (existe): " + lista.buscar(30));
        System.out.println("Buscar 99 (no existe): " + lista.buscar(99));
        System.out.println("Buscar 10 (cabeza): " + lista.buscar(10));
        System.out.println("Buscar 50 (ultimo): " + lista.buscar(50));
        lista.mostrarLista(); // Comprueba que la lista sigue intacta.

        if (!lista.buscar(30) || lista.buscar(99) || lista.contarNodos() != 5) {
            throw new AssertionError("Fallo en las pruebas de busqueda.");
        }
        System.out.println("[EXITO] Busqueda secuencial validada; cabeza intacta.");
    }
}
