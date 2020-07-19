/* Leer un número y mostrar su cuadrado, repetir el proceso
hasta que se introduzca un númeronegativo*/
package practicas;

import java.util.Scanner;

public class alCuadrado {
    public static void main(String[] args) {
        System.out.println("ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        System.out.println("el cuadrado de "+ N+ " es.");
        
        while(N >= 0){
            System.out.println(N * N);
            System.out.println("ingrese un numero: ");
            N = sc.nextInt();
            
        }
    }
}
