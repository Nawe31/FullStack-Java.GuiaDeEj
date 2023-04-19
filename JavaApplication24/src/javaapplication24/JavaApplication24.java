/*
Crear un programa que dado un numero determine si es par o impar.
 */
package javaapplication24;
import java.util.Scanner;

public class JavaApplication24 {


    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   
        System.out.println("ingrse un nuero");
        int num = leer.nextInt();
   
        
        if (num % 2 == 0){
            System.out.println("El NUMERO ES PAR");
            
        }
        else {
        
            System.out.println("El NUMERO ES IMPAR");}
    }
    
}
