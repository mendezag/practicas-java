/*Escribe un programa Java que pida por teclado el valor de un número N 
y muestre por pantalla todos los números desde 1 hasta N*/
package practicas;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Numeros del 1 al " + n + ": ");                                             
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
