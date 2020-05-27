import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner  (System.in);

    String nombre = "";
    String apellido = "";
    int edad = 0;
    int ingreso_mensual = 0;
    System.out.println("Bienvenido al sistema de prestamos bancarios, a continuacion le solicitamos que nos brinde los siguientes datos.");
    System.out.println("Cual es tu nombre?: ");
    nombre = in.nextLine();

    System.out.println("Cual es tu apellido?: ");
    apellido = in.nextLine();
    
    System.out.println("Cuntos años tienes?: ");
    edad = in.nextInt();

    System.out.println("Cual es su ingreso mensual?: ");
    ingreso_mensual = in.nextInt();

    if (edad >=18 && ingreso_mensual >= 25000){
    
    System.out.println("El cliente: " + " " + nombre + " " + apellido + " " + "Cumple con los requisitos");
    } else{
      System.out.println("El cliente: " + " " + nombre + " " + apellido + " " + "No cumple con los requisitos");
    }
  }
}