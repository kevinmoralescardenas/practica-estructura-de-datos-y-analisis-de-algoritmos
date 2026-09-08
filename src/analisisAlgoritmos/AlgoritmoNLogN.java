package analisisAlgoritmos;

public class AlgoritmoNLogN {
    public static void main(String[] args) {
        int n = 10;
        int contador = 0;

        //algoritmo =(N log N)

        for (int i = 0; i<n; i++) {

            int j=1;
            while(j<n) {
                j = j * 2;
                contador++;
            }
        }

        System.out.println("total de ejecuciones: " + contador);
    }
}
