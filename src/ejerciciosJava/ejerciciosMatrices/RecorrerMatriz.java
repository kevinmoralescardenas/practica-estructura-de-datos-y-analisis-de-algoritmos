package ejerciciosJava.ejerciciosMatrices;

public class RecorrerMatriz {
    public static void main(String[] args) {

        int[][] visualizaciones = {
                {1,0,0,1},
                {0,1,0,0},
                {0,0,1,0}
        };
        for(int i = 0; i < visualizaciones.length; i++){
            for(int j = 0; j < visualizaciones[i].length; j++){
                System.out.println(visualizaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
}
