/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package javaapplication21;
import java.util.Scanner;

public class JavaApplication21 {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    
        System.out.println("ingrese una frace");
        String frace = leer.nextLine();
        
        
        
           System.out.println("la frace en minuscula es : " + frace.toLowerCase());
           System.out.println("la frace en  mayuscula es : " + frace.toUpperCase());
    }
    
}
