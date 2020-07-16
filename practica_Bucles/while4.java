/*Escribe un programa Java que pida por teclado el valor de un número N y
muestre por pantalla todos los números desde N hasta 1.*/
package practicas;

import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int N = sc.nextInt();
        System.out.println("el numero ingresado es: "+ N);
        int i = N;
        
        while(i>= 0){
            System.out.println(i);
            i--;
        }
    }
}
