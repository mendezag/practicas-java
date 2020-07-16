/* Programa que pida que se introduzcan dos números enteros por teclado y 
muestre los números desde el menor hasta el mayor de los números introducidos.
Los dos números introducidos deben ser distintos. Si son iguales se mostrará 
un mensaje indicándolo y se vuelven a introducir.*/
package practicas;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1,numero2,mayor,menor;
       
        do {
            System.out.print("Introduce un número entero: ");
            numero1 = sc.nextInt();
            System.out.print("Introduce otro número entero distinto del anterior: ");                   
            numero2 = sc.nextInt();
            if(numero1 == numero2){
                System.out.println("Debes introducir dos números distintos");
            }
        } while (numero1 == numero2);
            
        if(numero1 > numero2){
            mayor = numero1;
            menor = numero2;
        }else{
            mayor = numero2;
            menor = numero1;
        }
       
        for(int i = menor; i <= mayor; i++){
            System.out.println(i);
        }
    }   
}
