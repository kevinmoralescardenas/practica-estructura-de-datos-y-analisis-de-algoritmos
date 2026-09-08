package analisisAlgoritmos;

public class AnalisisAlgoritmos {
    public static void main(String[] args) {
        int n = 10;
        int contador = 0;

        //algoritmo O (n)

        for (int i = 0; i<n; i++) {
            System.out.println("iteracion: " + i);

            contador++;
        }

        System.out.println("total de ejecuciones: " + contador);
    }
}
