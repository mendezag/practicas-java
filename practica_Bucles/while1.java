/*Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 
utilizando la instrucción while.*/
package practicas;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    
    System.out.println("ingrese un numero");
    int i = num.nextInt();
    
    while(i <= 100){
            System.out.println(i);         
            i++;
    }
  }
}
