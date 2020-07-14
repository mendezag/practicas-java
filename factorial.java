package ejercicios;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fact=1;
        int num=0;
        System.out.println ("Introduce numero");
        num = teclado.nextInt();
        for(int in=1;in<=num;in++) {
            fact*=in;
        }
        System.out.println ("o factorial e "+fact);	
    }  
}

