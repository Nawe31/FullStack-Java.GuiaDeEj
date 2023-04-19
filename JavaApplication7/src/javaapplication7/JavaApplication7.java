/* define una variable tipo boolean, double y char. guarda informacion a travez del scanner*/ 
package javaapplication7;
import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
       
        
        System.out.println("ejemplo");
        
         System.out.println("ingrese su numero");
          int numero = leer.nextInt();
        
        
          System.out.println("ingrese si es verdadero o falso");
        boolean bandera = leer.nextBoolean();
        
        System.out.println("ingrese su edad");
        double edad = leer.nextDouble();
        
      
        System.out.println("el numero es " + numero + " su condicion es " + bandera + " la edad es " + edad);
   
    }
    
    
    
}

