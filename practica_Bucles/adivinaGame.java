/*Realizar un juego para adivinar un número. Para ello pedir un número N, y 
luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor
con respecto a N. El proceso terminacuando el usuario acierta.*/
package practicas;

import java.util.Scanner;

public class adivinaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int adivinador = 0;
        System.out.print("introduce un numero cualquiera: ");
        N = sc.nextInt();
        System.out.println("intenta adivinar el valor de N ");
        adivinador = sc.nextInt();
        
        while(adivinador != N){
            if(adivinador < N){
                System.out.println("Menor");
                adivinador = sc.nextInt();
            }else if(adivinador > N){
                System.out.println("Mayor");
                adivinador = sc.nextInt();
            }   
        }
        System.out.println("Ganaste!!!");
    }      
}
