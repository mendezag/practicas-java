/*Programa java que imprima la tabla de multiplicar de N nunero*/
package practicas;

import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ne = 0;
        System.out.print("ingrese un numero: ");
        int i = Ne;
        Ne = sc.nextInt();
        System.out.println("Tabla del : " + Ne);
        for(i = 1; i <= 10; i++){
            System.out.println(Ne + " x " + i + " = " +Ne*i);
        }
    }
}
