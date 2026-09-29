package ejerciciosJava.ejerciciosMatrices;

public class Ejercicio7ActualizarMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("matriz original");
        mostrarMatriz(matriz);

        // actualizar valor
        actualizarValor(matriz, 1, 1, 99);

        System.out.println("matriz despues de la actualizacion: ");
        mostrarMatriz(matriz);
    }

    //metodo para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //metodo para actualizar un valor
    public static void actualizarValor(int[][] matriz, int fila, int columna, int nuevoValor){

        //validar los limintes
        if(fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length){
            System.out.println("valor fuera de rango");
            return;
        }
        //donde se actualiza
        matriz[fila][columna] = nuevoValor;
    }

}
