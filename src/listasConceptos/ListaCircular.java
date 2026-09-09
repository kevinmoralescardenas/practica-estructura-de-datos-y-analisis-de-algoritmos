package listasConceptos;

public class ListaCircular {

    Nodo cabeza;

    public ListaCircular() {

        cabeza = null;
    }

    /*INSERTAR EN UNA LISTA CIRCULAR*/

    public void insertar(int dato) {

        Nodo nuevo = new Nodo(dato);
// entra aqui si es el primer dato para añadir
        if (cabeza == null) {
            cabeza = nuevo;
            nuevo.siguiente = cabeza;

            // entra aqui para ingresar del tercer dato en adelante
        } else {

            Nodo actual = cabeza;

            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }

            // pasa directo aqui al ingresar el segundo dato
            actual.siguiente = nuevo;
            nuevo.siguiente = cabeza;

        }
    }



}
