package eficiencia;

//n no afecta y siempre se ejecutan la misma cantidad de instrucciones

public class E1ComplejidadConstante {
    public static void main(String[] args) {
        int n = 1000;
        int contador = 0;

        System.out.println("inicio del algoritmo");

        contador++;

        int x = 5;

        contador++;

        int y = 10;

        contador++;

        int suma = x + y;

        contador++;
        System.out.println("la suma es: " + suma);

        System.out.println("VALOR DE N: " + n);
        System.out.println("operaciones contadas: " + contador);
        System.out.println("complejidad O(1)");

    }
}
