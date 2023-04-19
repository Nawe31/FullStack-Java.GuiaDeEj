/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package javaapplication18;
import java.util.Scanner;

public class JavaApplication18 {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("ingrese cantidad de miembros en el equipo");
       int miembros = leer.nextInt();
       
       String [] vector = new String [miembros];
        
        for (int i = 0; i < miembros; i++) {
          System.out.println("ingrese nombre y apellido");
          String equipo = leer.nextLine();
            vector[i] = equipo; 
            
        }
       
         for (int i = 0; i < miembros; i++) {
            
          
            System.out.print("[" + vector[i] + "]");
            
        }
         
         System.out.println(" ");
    }
    
}
