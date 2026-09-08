package analisisAlgoritmos;

public class AlgoritmoCuadratico {
    public static void main(String[] args) {
        int n = 5;
        int contador = 0;

        //algoritmo = O(n^2)

        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                System.out.println(i + " " + j);
                contador++;
            }
        }
        System.out.println("total de ejecuciones: " + contador);
    }
}
