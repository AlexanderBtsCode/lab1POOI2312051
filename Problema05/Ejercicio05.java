
package Problema05;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
          int numDia=0; // valor que ingresa el usuario mediante teclado.
          System.out.println("Ingrese un numero de la semana(1-7):");
          numDia=scanner.nextInt();
          
          
          switch(numDia){
              case 1:
                System.out.println("Lunes");
                  break;
              case 2:
                  System.out.println("Martes");
                  break;
              case 3:
                 System.out.println("Miercoles");
                 break;
              case 4:
                  System.out.println("Jueves");
                  break;
              case 5:
                  System.out.println("Viernes");
                  break;
              case 6:
                  System.out.println("Sabado");
                  break;
              case 7:
                  System.out.println("Domingo");
                  break;
              default:
                  System.out.println("El numero ingresado es invalido");
                  break;
               }
            }
}