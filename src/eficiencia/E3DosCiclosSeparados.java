package eficiencia;

import java.util.Scanner;

public class E3DosCiclosSeparados {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("ingrese el valor de n: ");
        int n = sn.nextInt();

        int contador = 0;

        System.out.println("primer ciclo: ");
        for(int i = 0; i<n; i++) {
            contador++;
            System.out.println("i = " + i);
        }

        System.out.println("segundo ciclo: ");
        for(int j =0; j<n; j++) {
            contador++;
            System.out.println("j = " + j);
        }

        System.out.println("total de operaciones: " + contador);
        System.out.println("analisis O(n + n) = O(2n) = O(n)");

        sn.close();
    }
}
