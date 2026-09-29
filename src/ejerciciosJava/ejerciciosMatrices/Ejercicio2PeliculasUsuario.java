package ejerciciosJava.ejerciciosMatrices;

public class Ejercicio2PeliculasUsuario {
    public static void main (String[] args){
        int[][] visualizaciones = {
                {1,0,0,1},
                {0,1,1,0},
                {0,0,1,0}
        };

        int usuarioBuscado = 1; // usuario en posicion 1
        System.out.println("peliculas vistas por el usuario 1= " + usuarioBuscado + ":");

        for(int j = 0; j < visualizaciones[usuarioBuscado].length; j++){
            if(visualizaciones[usuarioBuscado][j] == 1) {
                System.out.println("pelicula: " + j);
            }
        }
    }
}
