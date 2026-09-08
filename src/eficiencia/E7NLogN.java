package eficiencia;

import java.util.Scanner;

public class E7NLogN {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("ingrese el valor de n: ");
        int n = sn.nextInt();

        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > 1; j = j / 2) {
                contador++;
                System.out.println("i = " + i + " j = "+ j);
            }
        }
            System.out.println("total de operaciones: " + contador);
            System.out.println("complejidad O(n log n)");

            sn.close();
    }
}
