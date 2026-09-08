package analisisAlgoritmos;

public class AlgoritmoLogaritmico {
    public static void main(String[] args) {
        int n = 100;
        int contador = 0;

        int i = 1;

        while(i < n) {
            System.out.println("valor: " + i);
            i = i * 2;

            contador++;
        }

        System.out.println("total de ejecuciones: " + contador);

    }
}
