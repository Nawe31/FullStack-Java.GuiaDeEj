/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package javaapplication23;
import java.util.Scanner;


public class JavaApplication23 {

   
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     
        System.out.println("  Ingrese un numero ");
        
        double num = leer.nextDouble();
        
        System.out.println("el doble es  " + ( num * 2) + " \n el triple es " + ( num * 3) + " \n la raiz es: " +Math.sqrt(num));
    }
    
}
