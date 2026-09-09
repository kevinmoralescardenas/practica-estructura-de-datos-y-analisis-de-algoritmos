package listasConceptos;

public class ListaSimple {

    Nodo cabeza;
    public ListaSimple() {

        cabeza = null;

    }

    //insertar al inicio

    public void insertarInicio(int dato) {


        Nodo nuevo = new Nodo(dato);


        nuevo.siguiente = cabeza;


        cabeza = nuevo;
    }

    public void insertarFinal(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {

            cabeza = nuevo;
        } else {

            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }

    }
// 100 1000 10000 1
    public void recorrer() {

        Nodo actual = cabeza;

        while (actual != null) {

            System.out.print(actual.dato + " -> ");

            actual = actual.siguiente;

        }

        System.out.println("null");

    }

    // 100 1000 10000 1
    // buscando al 1
    public boolean buscar(int valor) {

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.dato == valor) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    // 100 1000 10000 1
    //eliminar 1000
    public void eliminar(int valor) {

        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null) {

            if (actual.dato == valor) {

                if (anterior == null) {
                    cabeza = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }

                return;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

    }

}
