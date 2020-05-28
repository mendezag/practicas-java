import java.util.Scanner;

public class Practica_switch{
   public static void main(String args[]){
   
   Scanner  entrada = new Scanner(System.in);

   int num_uno = 5, num_dos = 4, resultado = 0;
   int parametro = 0;

   System.out.println("Ingrese un valor: ");
   parametro = entrada.nextInt();

   switch(parametro){
     
     case 1: resultado = num_uno + num_dos;
             System.out.println("El resultado de la suma es: " + resultado);
             break;

     case 2: resultado = num_uno - num_dos;
             System.out.println("El resultado de la resta es: " + resultado);
             break;
     
     case 3: resultado = num_uno * num_dos;
             System.out.println("El resultado de la multiplicacion es: " + resultado);
             break;

     case 4: resultado = num_uno / num_dos;
             System.out.println("El resultado de la division es: " + resultado);
             break;

     default: System.out.println("Error, la opcion no existe");
             break;
   }
 }
}