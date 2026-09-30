package ejerciciosJava.ejerciciosMatrices.implementacionListas;

public class ListaDispersa {
    Nodo cabeza;
    //insertar al final
    public void insertar(int fila, int columna, int valor) {
        Nodo nuevo = new Nodo(fila, columna, valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo aux = cabeza;
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }
    //recorrer
    public void recorrer() {
        Nodo aux = cabeza;
        while(aux != null) {
            System.out.print("(" + aux.fila + ", " + aux.columna + ", " + aux.valor + ")");
            aux = aux.siguiente;
        }
    }

    //eliminar
    public void eliminar(int fila, int columna){
        if(cabeza == null) {
            System.out.println("la lista esta vacia");
            return;
        }
        // caso uno, eliminar la cabeza
        if(cabeza.fila == fila && cabeza.columna == columna) {
           cabeza = cabeza.siguiente;
           return;
        }

        // caso 2 nodo intermedio
        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;

        while(actual!=null){
            if(actual.fila == fila && actual.columna == columna) {
                anterior.siguiente = actual.siguiente;
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        System.out.println("no existe un valor en: (" + fila + ", " + columna + ")");
    }
}
