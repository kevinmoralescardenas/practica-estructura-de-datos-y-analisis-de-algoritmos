package eficiencia;

import java.util.Scanner;

public class E6Logaritmica {
     public static void main(String[] args) {

         Scanner sn = new Scanner(System.in);
         System.out.println("ingrese el valor de n: ");
         int n = sn.nextInt();
         int contador = 0;

         for (int i = n; i > 1; i = i / 2) {
             contador++;
             System.out.println("valor actual de i: " + i);

         }

         System.out.println("total de iteraciones: " + contador);
         System.out.println("complejidad O(Log n)");

         sn.close();
     }
}
