package eficiencia;

import java.util.Scanner;

public class E4OCuadratica {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("ingrese el valor de n:  ");
        int n = sn.nextInt();

        int contador = 0;

        for (int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                contador++;
                System.out.println("i = " + i + " j = " + j);

            }
        }

        System.out.println("total de operaciones: " + contador);
        System.out.println("complejidad (<On^2)");

        sn.close();
    }
}
