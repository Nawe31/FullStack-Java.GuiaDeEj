/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package javaapplication20;
import java.util.Scanner;

public class JavaApplication20 {


    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          
          System.out.println(" ingrese apellido y nombre ");
           String nombre = leer.nextLine();
       
           
           System.out.println(" el nombre es " + nombre);
    }
    
}
