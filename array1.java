/*Programa Java que guarda en un array 10 números enteros que se leen por teclado.
A continuación se recorre el array y calcula cuántos números son positivos, 
cuántos negativos y cuántos ceros.*/

package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int pos = 0,neg = 0,cero = 0;
        int i;
        
        for(i = 0; i < array.length;i++){
        System.out.print("array[" + i + "]= ");
        array[i] = sc.nextInt();
    }
        System.out.println(Arrays.toString(array));
        
       for(i = 0; i < array.length;i++){
           if(array[i] >0){
               pos++;
           }else if(array [i]<0){
               neg++;
           }else{
               cero++;
           }
       }
       
       System.out.println("Positivos: " + pos);                                                                  
       System.out.println("Negativos: " + neg);
       System.out.println("Ceros: " + cero);
    } 
    
}

