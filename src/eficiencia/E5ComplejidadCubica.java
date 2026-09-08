package eficiencia;

import java.util.Scanner;

public class E5ComplejidadCubica {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("ingrese el valor de n:  ");
        int n = sn.nextInt();

        int contador = 0;

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++){
                for (int k= 0; k<n; k++) {
                    contador++;
                    System.out.println("i = " + i + " j = " + j + "k = " + k);
                }
            }
        }

        System.out.println("total de operaciones: " + contador);
        System.out.println("complejidad O(n^3)");
    }
}
