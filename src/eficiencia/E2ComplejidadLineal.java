package eficiencia;

import java.util.Scanner;

public class E2ComplejidadLineal {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);

        System.out.print("ingrese el valor de n: ");
        int n = sn.nextInt();

        int contador = 0;

        for(int i = 0; i<n; i++) {
            contador++;

            System.out.println("iteracion: " + i);

        }

        System.out.println("total de operaciones del ciclo: " + contador);
        System.out.println("complejidad O(n)");

        sn.close();
    }
}
