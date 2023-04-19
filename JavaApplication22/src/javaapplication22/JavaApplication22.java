/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaapplication22;
import java.util.Scanner;

public class JavaApplication22 {

    public static void main(String[] args) {
        
         double Fahrenheit; 
     
        Scanner leer = new Scanner (System.in);
        
       
        System.out.println("Ingrese cantidad de grados centígrados ");
        double grados = leer.nextDouble();
        
        
        Fahrenheit = (32 + (9 * grados / 5));
        
        System.out.println(" la cantidad de grados Fahrenheit es " +  Fahrenheit);
    }
    
}
