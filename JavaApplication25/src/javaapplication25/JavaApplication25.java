/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package javaapplication25;
import java.util.Scanner;

public class JavaApplication25 {


    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
        System.out.println("INGRESE UNA FRACE");
        String frace = leer.nextLine();
        
       
        
        
        if  ( frace.equalsIgnoreCase("eureka")){
            System.out.println("MENSAJE CORRECTO");
        }
        
        else {
            System.out.println("Mensaje incorrecto");
        }
      
    }
    
}
