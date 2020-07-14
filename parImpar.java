package ejercicios;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num = 0;
        System.out.println("inrese un numero: ");
        num = numero.nextInt();
        System.out.println("el numero ingresado ee: "+ num);
        
        if (num <0){
            System.out.println("el: " +num + " es negrativo");
        }else{
            System.out.println("el: " +num + " es positivo");
        }
        if (num %2 ==0){
            System.out.println("el: " +num + " es par");
        }else{
            System.out.println("el: " +num + " es impar");
        }   
    }
}
