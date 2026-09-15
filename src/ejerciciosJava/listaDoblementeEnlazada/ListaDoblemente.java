package ejerciciosJava.listaDoblementeEnlazada;

public class ListaDoblemente {

    Nodo cabeza;

    /*insertar nodos*/
    public void insertarInicio(int dato) {


        Nodo nuevo = new Nodo(dato);
//10
        // null 10 null


        if (cabeza != null) {
            cabeza.anterior = nuevo;
            nuevo.siguiente = cabeza;
        }

        cabeza = nuevo;
// cabeza -> null 10 null

    }

    /*Recorrer lista hacia adelante*/
    public void recorrer() {



        Nodo actual = cabeza;

        while (actual != null) {

            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;


        }

    }

    /*Recorrer la lista hacia atrás*/
    public void recorrerAtras() {



        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }


        while (actual != null) {

            System.out.print(actual.dato + " <- ");
            actual = actual.anterior;


        }

    }


}


