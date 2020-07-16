/*Escribe un programa Java que pida por teclado el valor de un número N 
y muestre por pantalla todos los números desde 1 hasta N.*/
package practicas;

import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int N = sc.nextInt();
        System.out.println("i aumentara hasta el numero: " + N);
        int i = 1;
        
        for(i = 1;i<= N; i++){
            System.out.println(i);
        }
        
    }
}
