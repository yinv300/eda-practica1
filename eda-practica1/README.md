# Clase 2 - Listas Enlazadas Simples en Java

Taller autonomo: implementar `buscar(T valorBuscado)` en `src/ListaEnlazadaSimple.java` sin alterar `cabeza` y habilitar las pruebas del Paso 4 en `src/Main.java`.

## Archivos

- `src/Nodo.java`: nodo generico con dato y enlace al siguiente.
- `src/ListaEnlazadaSimple.java`: inserciones, recorrido, conteo y busqueda secuencial.
- `src/Main.java`: inserciones y pruebas de busqueda (Paso 4 habilitado).

## Ejecutar

Desde la raiz del proyecto, con JDK instalado:

```bash
javac src/*.java
java -cp src Main
```

## Resultado esperado

```text
Estado: [10] -> [20] -> [30] -> [40] -> [50] -> null
Cantidad de nodos: 5
Buscar 30 (existe): true
Buscar 99 (no existe): false
Buscar 10 (cabeza): true
Buscar 50 (ultimo): true
Estado: [10] -> [20] -> [30] -> [40] -> [50] -> null
[EXITO] Busqueda secuencial validada; cabeza intacta.
```

La busqueda recorre con un puntero auxiliar `actual`, compara datos con `Objects.equals` (equivalente seguro ante `null` a usar `.equals`) y retorna `true` al encontrar el valor o `false` al finalizar.
